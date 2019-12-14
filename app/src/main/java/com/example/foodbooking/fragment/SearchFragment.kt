package com.example.foodbooking.fragment


import android.app.Activity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodbooking.AppConstants
import com.example.foodbooking.R
import com.example.foodbooking.SettingService
import com.example.foodbooking.adapter.SearchAdapter
import com.example.foodbooking.apis.ApiService
import com.example.foodbooking.apis.responseModels.GetCategories
import com.example.foodbooking.apis.responseModels.GetDataSearch
import com.example.foodbooking.data.Search_data
import com.example.foodbooking.data.promotionSearch
import com.google.gson.GsonBuilder
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_delivery.*
import kotlinx.android.synthetic.main.fragment_search.*
import retrofit2.HttpException

/**
 * A simple [Fragment] subclass.
 */
class SearchFragment : Fragment() {
    private val apiService by lazy {
        ApiService.create()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_search, container, false)
        val token = SettingService.Get(AppConstants.TOKENKEY, context as Activity)
        val search = view.findViewById<EditText>(R.id.edSearch)
        val recyvler = view.findViewById<RecyclerView>(R.id.recyclerview_recent)

        search.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                apiService.getDataSearch(search.text.toString(), "Bearer $token")
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(this::handleCategoryResponse, this::handleError)
            }

            fun handleCategoryResponse(getDataSearch: GetDataSearch) {

                val search = ArrayList<Search_data>()

                for (itemPro in getDataSearch.data) {
                    val promo = ArrayList<promotionSearch>()

                    for (pro in itemPro.promotions) {
                        promo.add(promotionSearch(pro.text, pro.image))
                    }
                    search.add(
                        Search_data(
                            promo,
                            itemPro.address,
                            itemPro.name,
                            itemPro.priceRange,
                            itemPro.image,
                            itemPro.cuisines,
                            itemPro.deliveryId
                        )
                    )

                }
                recyvler.layoutManager = LinearLayoutManager(view.context)
                recyvler.adapter = SearchAdapter(search, view.context)

            }


            fun handleError(error: Throwable) {
                var message = "An error occurred"
                if (error is HttpException) {
                    // Kotlin will smart cast at this point
                    val errorJsonString = error.response().errorBody()?.string()
                    val gson = GsonBuilder().setPrettyPrinting().create()
                    val loginresponse = gson.fromJson(errorJsonString, GetCategories::class.java)
                    message = loginresponse.error

                } else {
                    message = error.message ?: message
                }
                Toast.makeText(view.context, "Error ${message}", Toast.LENGTH_LONG).show()

            }

        })



        return view
    }
//    fun handleCategoryResponse(getDataSearch: GetDataSearch) {
//
//        val search = ArrayList<Search_data>()
//
//        for (itemPro in getDataSearch.data) {
//            val promo = ArrayList<promotionSearch>()
//
//            for (pro in itemPro.promotions) {
//                promo.add(promotionSearch(pro.text, pro.image))
//            }
//            search.add(
//                Search_data(
//                    promo,
//                    itemPro.address,
//                    itemPro.name,
//                    itemPro.priceRange,
//                    itemPro.image,
//                    itemPro.cuisines,itemPro.deliveryId
//                )
//            )
//
//        }
//        this.recyclerview_recent.layoutManager = LinearLayoutManager(this.context)
//        this.recyclerview_recent.adapter = SearchAdapter(search, this.context)
//
//    }
//
//
//    fun handleError(error: Throwable) {
//        var message = "An error occurred"
//        if (error is HttpException) {
//            // Kotlin will smart cast at this point
//            val errorJsonString = error.response().errorBody()?.string()
//            val gson = GsonBuilder().setPrettyPrinting().create()
//            val loginresponse = gson.fromJson(errorJsonString, GetCategories::class.java)
//            message = loginresponse.error
//
//        } else {
//            message = error.message ?: message
//        }
//        Toast.makeText(this.context, "Error ${message}", Toast.LENGTH_LONG).show()
//
//    }

}
