package com.example.foodbooking.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.foodbooking.R
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView


/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_profile, container, false)

        val profileImage = view.findViewById<CircleImageView>(R.id.profile_image);

        Picasso.get()
            .load("https://images.foody.vn/res/g93/920647/prof/s640x400/foody-upload-api-foody-mobile-lklk-190522154211.jpg")
            .into(profileImage);

        return view;
    }


}
