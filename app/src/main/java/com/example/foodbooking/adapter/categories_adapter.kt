package com.example.foodbooking.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodbooking.R
import com.example.foodbooking.data.Categories_food
import com.squareup.picasso.Picasso


class CategoriesAdapter(val categories:List<Categories_food>, val context: Context?): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.categories_item,parent,false)
        return CategoriesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentCategories =  categories[position]
        (holder as CategoriesViewHolder).bindData(currentCategories)
    }


}
class CategoriesViewHolder( val view: View) : RecyclerView.ViewHolder(view) {

    val tvCategoriesName = view.findViewById<TextView>(R.id.tvResNameCategories)
    val imageview = view.findViewById<ImageView>(R.id.imgResCategories)


    fun bindData(categories : Categories_food){
        tvCategoriesName.text = categories.CategoriesName
        Picasso.get().load("https://images.foody.vn/res/g93/920647/prof/s640x400/foody-upload-api-foody-mobile-lklk-190522154211.jpg").into(imageview)
    }
}