package com.example.foodbooking.apis


import com.example.foodbooking.apis.requestModels.LoginRequest
import com.example.foodbooking.apis.requestModels.RegisterRequest
import com.example.foodbooking.apis.responseModels.GetCurrentUserResponse
import com.example.foodbooking.apis.responseModels.LoginResponse
import com.example.foodbooking.apis.responseModels.RegisterResponse
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface ApiRequestInterface {

    @POST("user/login")
    fun login(@Body request: LoginRequest): Observable<LoginResponse>

    @GET("user/{userId}")
    fun getCurrentUser(@Path("userId") userId: String, @Header("Authorization") token: String) : Observable<GetCurrentUserResponse>

    @POST("user/register")
    fun Register(@Body register : RegisterRequest) : Observable<RegisterResponse>

}

