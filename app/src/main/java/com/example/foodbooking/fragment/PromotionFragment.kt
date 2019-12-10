package com.example.foodbooking.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodbooking.R
import com.example.foodbooking.adapter.PrtionAdapter
import com.example.foodbooking.data.Promotions


/**
 * A simple [Fragment] subclass.
 */
class PromotionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_promotion,container,false)
        val rvPrtion = view.findViewById<RecyclerView>(R.id.rvPrtion)
        val prtion = ArrayList<Promotions>()

        prtion.add(Promotions("1","03 Oct 2018"))
        prtion.add(Promotions("2","03 Oct 2018"))
        prtion.add(Promotions("3","03 Oct 2018"))
        prtion.add(Promotions("4","03 Oct 2018"))
        prtion.add(Promotions("5","03 Oct 2018"))
        prtion.add(Promotions("6","03 Oct 2018"))

        val adapter = PrtionAdapter(prtion, this.activity)
        rvPrtion.layoutManager = LinearLayoutManager(this.activity)
        rvPrtion.adapter = adapter

        return view



    }


}
