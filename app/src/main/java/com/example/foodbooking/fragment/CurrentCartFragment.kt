package com.example.foodbooking.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodbooking.R
import com.example.foodbooking.adapter.OdersCurrentAdapter
import com.example.foodbooking.data.Oders_Current_Cart

/**
 * A simple [Fragment] subclass.
 */
class CurrentCartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_current_cart, container, false)
        val rvCurrentCart = view.findViewById<RecyclerView>(R.id.recyclerview_CurrentCart)
        val currentCart = ArrayList<Oders_Current_Cart>()

        currentCart.add(Oders_Current_Cart("Crispy Sesame Chicken with a Sticky Asian Sauce ","S\$420.000"))
        currentCart.add(Oders_Current_Cart("Crispy Sesame Chicken with a Sticky Asian Sauce ","S\$420.000"))

        rvCurrentCart.layoutManager = LinearLayoutManager(this.activity)
        rvCurrentCart.adapter = OdersCurrentAdapter(currentCart,this.activity)
        return view
    }


}
