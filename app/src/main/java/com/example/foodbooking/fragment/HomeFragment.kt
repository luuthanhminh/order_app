package com.example.foodbooking.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodbooking.R
import com.example.foodbooking.adapter.CategoriesAdapter
import com.example.foodbooking.adapter.ComboAdapter
import com.example.foodbooking.adapter.HighlightAdapter
import com.example.foodbooking.adapter.PlanAdapter
import com.example.foodbooking.data.Categories_food
import com.example.foodbooking.data.Combo_food
import com.example.foodbooking.data.HighLight_food
import com.example.foodbooking.data.Plan_food

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val rvFoods = view.findViewById<RecyclerView>(R.id.recyclerview_plant)
        val meals = ArrayList<Plan_food>()


        meals.add(Plan_food("Fishy Lunch Box","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis quis finibus risus. Donec felis dolor, vulputate at hendrerit nec, ultrices id nibh. Nullam nec metus in mi sollicitudin tempor consequat non sem. ","The Girlls Sai Gon","Barbecure & bar"))
        meals.add(Plan_food("Fishy Lunch Box","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis quis finibus risus. Donec felis dolor, vulputate at hendrerit nec, ultrices id nibh. Nullam nec metus in mi sollicitudin tempor consequat non sem. ","The Girlls Sai Gon","Barbecure & bar"))
        meals.add(Plan_food("Fishy Lunch Box","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis quis finibus risus. Donec felis dolor, vulputate at hendrerit nec, ultrices id nibh. Nullam nec metus in mi sollicitudin tempor consequat non sem. ","The Girlls Sai Gon","Barbecure & bar"))
        meals.add(Plan_food("Fishy Lunch Box","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis quis finibus risus. Donec felis dolor, vulputate at hendrerit nec, ultrices id nibh. Nullam nec metus in mi sollicitudin tempor consequat non sem. ","The Girlls Sai Gon","Barbecure & bar"))
        meals.add(Plan_food("Fishy Lunch Box","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis quis finibus risus. Donec felis dolor, vulputate at hendrerit nec, ultrices id nibh. Nullam nec metus in mi sollicitudin tempor consequat non sem. ","The Girlls Sai Gon","Barbecure & bar"))

        rvFoods.layoutManager = LinearLayoutManager(this.activity, LinearLayoutManager.HORIZONTAL ,false)
        rvFoods.adapter = PlanAdapter(meals,this.activity)

        val rvCate  = view.findViewById<RecyclerView>(R.id.recyclerview_categories)
        val category = ArrayList<Categories_food>()

        category.add(Categories_food("Bakery"))
        category.add(Categories_food("Catering"))
        category.add(Categories_food("Chinese"))
        category.add(Categories_food("Coffee"))
        category.add(Categories_food("Fastfood"))
        category.add(Categories_food("Bakery"))
        category.add(Categories_food("Catering"))
        category.add(Categories_food("Chinese"))
        category.add(Categories_food("Coffee & Tea"))
        category.add(Categories_food("Fastfood"))
        rvCate.layoutManager = LinearLayoutManager(this.activity,LinearLayoutManager.HORIZONTAL ,false)
        rvCate.adapter = CategoriesAdapter(category,this.activity)

        rvCate.setOnClickListener {
            Toast.makeText(this.activity,"AAAAA",Toast.LENGTH_LONG).show()
        }


        val rvHighlight = view.findViewById<RecyclerView>(R.id.recyclerview_highlight)
        val highlight = ArrayList<HighLight_food>()

        highlight.add(HighLight_food("Salmon Pasta with a Creamy Garlic Sauce","S\$1800.00","The Girlls Sai Gon","Barbecure & bar"))
        highlight.add(HighLight_food("Salmon Pasta with a Creamy Garlic Sauce","S\$1800.00","Jalapeno Restaurant","Mexico Cuisine"))
        highlight.add(HighLight_food("Salmon Pasta with a Creamy Garlic Sauce","S\$1800.00","The Girlls Sai Gon","Barbecure & bar"))
        highlight.add(HighLight_food("Salmon Pasta with a Creamy Garlic Sauce","S\$1800.00","Jalapeno Restaurant","Mexico Cuisine"))

        rvHighlight.layoutManager = LinearLayoutManager(this.activity)
        rvHighlight.adapter = HighlightAdapter(highlight,this.activity)

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
