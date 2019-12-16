package com.example.foodbooking.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodbooking.R
import com.example.foodbooking.data.Category_foods_detail
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.item_categories_food.view.*

class Category_foodAdapter(val cate:List<Category_foods_detail>,val context :Context?):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_categories_food,parent,false)
        return CategoryFoodViewHolder(view)
    }

    override fun getItemCount(): Int {
       return cate.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val current = cate[position]
        (holder as CategoryFoodViewHolder).bindData(current)
    }
}
class CategoryFoodViewHolder( val view: View) : RecyclerView.ViewHolder(view) {
    val namecate = view.findViewById<TextView>(R.id.tvNameCateFood)
    val img = view.findViewById<ImageView>(R.id.imgCateFood)
    val price= view.findViewById<TextView>(R.id.tvPriceCateFood)
    val detailcate = view.findViewById<TextView>(R.id.tvDetailCateFood)
    val logores = view.findViewById<CircleImageView>(R.id.imgLogoCateFood)
    val namrescate = view.findViewById<TextView>(R.id.tvNameCateFoodRes)
    val cusecui = view.findViewById<TextView>(R.id.tvCusecuisCateFood)


    fun bindData(category : Category_foods_detail){
        namecate.text = category.NameCateFood
        Picasso.get().load(category.ImageCateFood).into(img)
        price.text = category.PriceCateFood
        detailcate.text = category.DetailCateFood
        namrescate.text = category.NameCateFoodRestaurant
        cusecui.text = category.CusecuisCateFood
        Picasso.get().load(category.LogoCateFoodRestaurant).into(logores)

    }
}