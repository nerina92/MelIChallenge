package com.example.melichallenge.data

import com.example.melichallenge.domain.model.SearchResponse
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface InterfazMeliChallRepository {
    @GET("/sites/MLA/search")
    suspend fun getSearchResponse(@Query("q") q: String): Response<SearchResponse>

    @GET("/items/{id}")
    suspend fun getItemDetail(@Path("id") id:String):Response<ResponseBody>
}

