package com.example.pexelphotos.model.remote

import com.example.pexelphotos.common.Constants
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object HttpRequest {
    private val builder: Retrofit.Builder =
        Retrofit.Builder()

    fun getService(): Api{
        builder.baseUrl(Constants.BASE_URL)
        builder.addConverterFactory(GsonConverterFactory.create())
        builder.addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        return builder.build().create(Api::class.java)
    }
}