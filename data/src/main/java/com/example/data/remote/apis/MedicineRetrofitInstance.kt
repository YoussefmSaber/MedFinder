package com.example.data.remote.apis

import com.example.data.remote.MedicineDataApiService
import com.example.data.remote.UserDataApiService
import com.example.data.utils.Constants
import com.example.data.utils.Constants.Companion.BASE_URL
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

object MedicineRetrofitInstance {

    private val medicineRetrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://eshfeeny.onrender.com/products/category/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val medicineApi: MedicineDataApiService by lazy {
        medicineRetrofit.create(MedicineDataApiService::class.java)
    }
}