package com.dicoding.gymtoolkit.data.remote

import com.dicoding.gymtoolkit.data.remote.dto.NewsResponse
import com.dicoding.gymtoolkit.util.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("everything")
    suspend fun getNews(
        @Query("page") page: Int,
        @Query("sources") sources: String,
        @Query("apiKey") apiKey: String = API_KEY
    ): NewsResponse
}