package com.example.pexelphotos.model.remote

import com.example.pexelphotos.common.Constants
import com.example.pexelphotos.model.PhotoResponse
import retrofit2.http.GET
import retrofit2.http.Query
import io.reactivex.rxjava3.core.Observable

interface Api {
    @GET(Constants.END_POINT)
    fun getPhotos(
        @Query("key") keyValue: String,
        @Query("q") photoType: String,
        @Query("image_type") imageType: String,
        @Query("order_param") orderParam: String
    ): Observable<PhotoResponse>
}