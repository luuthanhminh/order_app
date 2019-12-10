package com.example.foodbooking.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodbooking.R
import com.example.foodbooking.data.HighLight_food

class HighlightAdapter(val highlight:List<HighLight_food>, val context: Context?): RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.highlight_item,parent,false)
        return HighlightViewHolder(view)
    }

    override fun getItemCount(): Int {
        return highlight.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentHighlight_food =  highlight[position]
        (holder as HighlightViewHolder).bindData(currentHighlight_food)
    }
}
class HighlightViewHolder( val view: View) : RecyclerView.ViewHolder(view) {

    val tvNameFood = view.findViewById<TextView>(R.id.tvNameRestaurant)
    val tvCostFood = view.findViewById<TextView>(R.id.tvCostFood)
    val tvNameRes = view.findViewById<TextView>(R.id.tvNameRestaurant)
    val tvDetailRes = view.findViewById<TextView>(R.id.tvDetailRestaurant)

    fun bindData(highlights : HighLight_food){
        tvNameFood.text = highlights.NameHighlightFood
        tvCostFood.text = highlights.CostFood
        tvNameRes.text = highlights.NameHighlightRestaurant
        tvDetailRes.text= highlights.DetailHighlightRestaurant
    }
}