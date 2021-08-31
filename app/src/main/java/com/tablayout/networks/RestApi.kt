package com.tablayout.networks

import com.tablayout.model.Photo
import retrofit2.http.GET

interface RestApi {
    @GET("/v2/list")
    suspend fun getPhotos(): ArrayList<Photo>
}