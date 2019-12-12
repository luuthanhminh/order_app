package com.example.foodbooking.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodbooking.R
import com.example.foodbooking.adapter.HighlightAdapter
import com.example.foodbooking.data.HighLight_food

/**
 * A simple [Fragment] subclass.
 */
class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_search, container, false)
//        val rvHighlight = view.findViewById<RecyclerView>(R.id.recyclerview_recent)
//        val highlight = ArrayList<HighLight_food>()
//
//        highlight.add(HighLight_food("Salmon Pasta with a Creamy Garlic Sauce","S\$1800.00","The Girlls Sai Gon","Barbecure & bar"))
//        highlight.add(HighLight_food("Salmon Pasta with a Creamy Garlic Sauce","S\$1800.00","Jalapeno Restaurant","Mexico Cuisine"))
//        highlight.add(HighLight_food("Salmon Pasta with a Creamy Garlic Sauce","S\$1800.00","The Girlls Sai Gon","Barbecure & bar"))
//        highlight.add(HighLight_food("Salmon Pasta with a Creamy Garlic Sauce","S\$1800.00","Jalapeno Restaurant","Mexico Cuisine"))
//
//        rvHighlight.layoutManager = LinearLayoutManager(this.activity)
//        rvHighlight.adapter = HighlightAdapter(highlight,this.activity)
        return view
    }


}
