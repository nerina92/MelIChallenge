package com.example.melichallenge.data

import com.example.melichallenge.model.Item
import com.example.melichallenge.network.ApiServiceMeliChallenge
import org.json.JSONObject

class MeliChallengeRepository constructor(
    private val api: ApiServiceMeliChallenge
){
    suspend fun getSearchResponse(search:String):List<Item>{
        return api.getItemsSearchResponse(search)
    }

    suspend fun getDetailItem(id:String):JSONObject{
        val respuesta = api.getItemDetail(id)
        println("respuesta api: $respuesta")
        return JSONObject(respuesta)
    }
}