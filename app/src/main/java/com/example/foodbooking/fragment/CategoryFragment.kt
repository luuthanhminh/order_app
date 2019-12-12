package com.example.foodbooking.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodbooking.R
import com.example.foodbooking.adapter.ComboAdapter
import com.example.foodbooking.adapter.HighlightAdapter
import com.example.foodbooking.data.Combo_food
import com.example.foodbooking.data.HighLight_food

/**
 * A simple [Fragment] subclass.
 */
class CategoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_category, container,true)


//        val rvHighlight = view.findViewById<RecyclerView>(R.id.recyclerview_highlight)
//        val highlight = ArrayList<HighLight_food>()
//
//        highlight.add(HighLight_food("Salmon Pasta with a Creamy Garlic Sauce","S\$1800.00","The Girlls Sai Gon","Barbecure & bar"))
//        highlight.add(HighLight_food("Salmon  with a Creamy Garlic Sauce","S\$1800.00","Jalapeno Restaurant","Mexico Cuisine"))
//        highlight.add(HighLight_food("Salmon Pasta Creamy Garlic Sauce","S\$1800.00","The Girlls Sai Gon","Barbecure & bar"))
//        highlight.add(HighLight_food("Salmon Pasta withc Sauce","S\$1800.00","Jalapeno Restaurant","Mexico Cuisine"))
//
//        rvHighlight.layoutManager = LinearLayoutManager(this.activity)
//        rvHighlight.adapter = HighlightAdapter(highlight,this.activity)

        val rvCombo = view.findViewById<RecyclerView>(R.id.recyclerview_combo)
        val cb = ArrayList<Combo_food>()

        cb.add(
            Combo_food("HOT & SPICY CHICKEN COMBO","S$1800.00","01 Hot & Spicy Chicken Burger\n" +
                    "01 French Fries (M)\n" +
                    "01 Pepsi (M)","Lotteria","Fastfood")
        )
        cb.add(
            Combo_food("HOT & SPICY CHICKEN COMBO","S$1800.00","01 Hot & Spicy Chicken Burger\n" +
                    "01 French Fries (M)\n" +
                    "01 Pepsi (M)","Lotteria","Fastfood")
        )
        cb.add(
            Combo_food("HOT & SPICY CHICKEN COMBO","S$1800.00","01 Hot & Spicy Chicken Burger\n" +
                    "01 French Fries (M)\n" +
                    "01 Pepsi (M)","Lotteria","Fastfood")
        )
        cb.add(
            Combo_food("HOT & SPICY CHICKEN COMBO","S$1800.00","01 Hot & Spicy Chicken Burger\n" +
                    "01 French Fries (M)\n" +
                    "01 Pepsi (M)","Lotteria","Fastfood")
        )
        rvCombo.layoutManager = LinearLayoutManager(this.activity)
        rvCombo.adapter = ComboAdapter(cb,this.activity)
        return view
    }


}
