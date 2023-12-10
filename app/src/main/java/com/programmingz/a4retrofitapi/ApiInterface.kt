package com.programmingz.a4retrofitapi

import okhttp3.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("products")
    fun getProductData(): retrofit2.Call<MyData>
}