package com.example.foodbooking.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodbooking.R
import com.example.foodbooking.data.Combo_food


class ComboAdapter(val cb:List<Combo_food>, val context: Context?): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.combo_item,parent,false)
        return ComboViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cb.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentCombo_food =  cb[position]
        (holder as ComboViewHolder).bindData(currentCombo_food)
    }
}
class ComboViewHolder( val view: View) : RecyclerView.ViewHolder(view) {

    val tvNamecbFood = view.findViewById<TextView>(R.id.tvComboName)
    val tvCbCost = view.findViewById<TextView>(R.id.tvComboCost)
    val tvfood1 = view.findViewById<TextView>(R.id.tvCbFood1)
    val tvNamres = view.findViewById<TextView>(R.id.tvCbNameRes)
    val tvDetailres = view.findViewById<TextView>(R.id.tvCbDetailRes)

    fun bindData(cb : Combo_food){
        tvNamecbFood.text = cb.NameCbFood
        tvCbCost.text = cb.CostCbFood
        tvfood1.text = cb.food1
        tvNamres.text = cb.NamecbRestaurant
        tvDetailres.text = cb.DetailcbRestaurant

    }
}