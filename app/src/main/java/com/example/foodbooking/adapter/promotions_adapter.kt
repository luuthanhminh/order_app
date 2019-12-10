package com.example.foodbooking.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodbooking.R
import com.example.foodbooking.data.Promotions


class PrtionAdapter(val prtion:List<Promotions>, val context: Context?) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_promotions,parent,false)
        return PrtionViewHolder(view)
    }

    override fun getItemCount(): Int  {
        return prtion.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentItem = prtion[position]
        (holder as PrtionViewHolder).binData(currentItem)
    }
}

class PrtionViewHolder(val view: View): RecyclerView.ViewHolder(view){
    val tvPrtionName = view.findViewById<TextView>(R.id.txtPmtion)
    val tvPrtionTime = view.findViewById<TextView>(R.id.txtPmtion2)
    val tvPrtionIcon = view.findViewById<ImageView>(R.id.imgPmtion)

    fun binData(prtion : Promotions){
        tvPrtionName.text = prtion.PrtionName
        tvPrtionTime.text = prtion.PrtionTime
    }
}