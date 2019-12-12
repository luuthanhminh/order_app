package com.example.foodbooking.apis


import com.example.foodbooking.apis.requestModels.LoginRequest
import com.example.foodbooking.apis.responseModels.GetCurrentUserResponse
import com.example.foodbooking.apis.responseModels.GetDasboardResponse
import com.example.foodbooking.apis.responseModels.LoginResponse
import io.reactivex.Observable
import retrofit2.http.*

interface ApiRequestInterface {

    @POST("user/login")
    fun login(@Body request: LoginRequest): Observable<LoginResponse>

    @GET("user/{userId}")
    fun getCurrentUser(@Path("userId") userId: String, @Header("Authorization") token: String) : Observable<GetCurrentUserResponse>


    @GET("home/dashboard")
    fun getDashBoard(@Header("Authorization") token: String): Observable<GetDasboardResponse>
}

