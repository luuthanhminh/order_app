package com.example.foodbooking.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodbooking.R
import com.example.foodbooking.data.Plan_food


class PlanAdapter(val food:List<Plan_food>, val context: Context?): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.plant_item,parent,false)
        return PlanViewHolder(view)
    }

    override fun getItemCount(): Int {
        return food.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentPlan_food =  food[position]
        (holder as PlanViewHolder).bindData(currentPlan_food)
//        holder.itemView.setOnClickListener {
//            Log.d("BBB",position.toString())
//        }
    }


}
class PlanViewHolder( val view: View) : RecyclerView.ViewHolder(view){

    val tvNameFood = view.findViewById<TextView>(R.id.txtNameFood)
    val tvDetailFood = view.findViewById<TextView>(R.id.txtDetailFood)
    val tvNameRes = view.findViewById<TextView>(R.id.txtNameRestaurant)
    val tvDetailRes = view.findViewById<TextView>(R.id.txtDetailRestaurant)

    fun bindData(foods : Plan_food){
        tvNameFood.text = foods.NameFood
        tvDetailFood.text = foods.DetailFood
        tvNameRes.text = foods.NameRestaurant
        tvDetailRes.text= foods.DetailRestaurant
    }
}