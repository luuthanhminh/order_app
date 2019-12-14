package com.example.foodbooking.fragment


import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodbooking.AppConstants
import com.example.foodbooking.R
import com.example.foodbooking.SettingService
import com.example.foodbooking.adapter.CategoriesAdapter
import com.example.foodbooking.adapter.HighlightAdapter
import com.example.foodbooking.adapter.PlanAdapter
import com.example.foodbooking.apis.ApiService
import com.example.foodbooking.apis.responseModels.GetDasboardResponse
import com.example.foodbooking.data.Categories_food
import com.example.foodbooking.data.HighLight_food
import com.example.foodbooking.data.Plan_food
import com.google.gson.GsonBuilder
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_home.*
import retrofit2.HttpException

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
    private val apiService by lazy {
        ApiService.create()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val token = SettingService.Get(AppConstants.TOKENKEY, this.activity as Activity)

        apiService.getDashBoard("Bearer $token")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnComplete { hideloading() }
            .subscribe(this::handleDashBoardResponse, this::handleError)
        return view
    }

    fun handleDashBoardResponse(getDasboard: GetDasboardResponse) {
        //highlight
        val highlightFood = ArrayList<HighLight_food>()
        for (itemHL in getDasboard.data.foods) {
            highlightFood.add(
                HighLight_food(
                    itemHL.image,
                    itemHL.name,
                    itemHL.price.text,
                    itemHL.restaurantImage,
                    itemHL.restaurantName,
                    itemHL.description
                )
            )
        }
        recyclerview_highlight.layoutManager = LinearLayoutManager(this.activity)
        recyclerview_highlight.adapter = HighlightAdapter(highlightFood, this.activity)
        //plant
        val planFood = ArrayList<Plan_food>()
        for (itemPlan in getDasboard.data.promotions) {
            planFood.add(
                Plan_food(
                    itemPlan.image,
                    itemPlan.name,
                    itemPlan.promotionTitle,
                    itemPlan.cuisines,
                    itemPlan.address
                )
            )
        }
        recyclerview_plant.layoutManager =
            LinearLayoutManager(this.activity, LinearLayoutManager.HORIZONTAL, false)
        recyclerview_plant.adapter = PlanAdapter(planFood, this.activity)
        //categories
        val category = ArrayList<Categories_food>()
        for (item in getDasboard.data.categories) {
            category.add(Categories_food(item.category, item.url, item.id))
        }
        recyclerview_categories.layoutManager =
            LinearLayoutManager(this.activity, LinearLayoutManager.HORIZONTAL, false)
        recyclerview_categories.adapter = CategoriesAdapter(category, this.activity)

    }

    fun handleError(error: Throwable) {
        var message = "An error occurred"
        if (error is HttpException) {
            // Kotlin will smart cast at this point
            val errorJsonString = error.response().errorBody()?.string()
            val gson = GsonBuilder().setPrettyPrinting().create()
            val loginresponse = gson.fromJson(errorJsonString, GetDasboardResponse::class.java);
            message = loginresponse.error

        } else {
            message = error.message ?: message
        }
        if (message == "Unauthorized") {
            Toast.makeText(this.activity, "Phiên đăng nhập đã hết hạn", Toast.LENGTH_LONG)
                .show()
            SettingService.Save(AppConstants.TOKENKEY, "", this.activity as Activity)
            this.activity?.finish()
        }
//        else {
//            Toast.makeText(this.activity, "Error ${message}", Toast.LENGTH_LONG).show()
//        }
    }

    fun showloading() {
        pbLoadingHome.visibility = View.VISIBLE
    }

    fun hideloading() {
        pbLoadingHome.visibility = View.GONE
    }
}
