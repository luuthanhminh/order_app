package com.example.foodbooking.apis

import com.example.foodbooking.AppConstants
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ApiService {
    companion object {
        fun create(): ApiRequestInterface {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(AppConstants.API_URL_BASE)
                .build()
                .create(ApiRequestInterface::class.java);
            return retrofit
        }
    }
}
