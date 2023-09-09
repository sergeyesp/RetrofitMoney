package com.example.retrofitmoney.data.api

import retrofit2.Retrofit

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder().baseUrl("https://api.privatbank.ua/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}