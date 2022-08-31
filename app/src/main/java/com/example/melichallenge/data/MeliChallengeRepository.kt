package com.example.melichallenge.data

import com.example.melichallenge.domain.model.Item
import com.example.melichallenge.domain.model.SearchRowMeliChallenge
import com.example.melichallenge.network.ApiServiceMeliChallenge
import org.json.JSONObject

class MeliChallengeRepository constructor(
    private val api: ApiServiceMeliChallenge
){
    suspend fun getSearchResponse(search:String):List<SearchRowMeliChallenge>{
        val response = api.getItemsSearchResponse(search)
        val myList=ArrayList<SearchRowMeliChallenge> ()
        for (i in response){
            val sheeping = if(i.shipping.free_shipping){
                if(i.shipping.tags.contains("fulfillment")){
                    "Envío gratis - ⚡ FULL"
                }else{
                    "Envío gratis"
                }
            }else{
                ""
            }
            val srmc = SearchRowMeliChallenge(
                id = i.id,
                title = i.title,
                url = i.thumbnail,
                price = (i.price).toString(),
                sheeping = sheeping
            )
            myList.add(srmc)
        }
        return myList;
    }

    suspend fun getDetailItem(id:String):JSONObject{
        val respuesta = api.getItemDetail(id)
        println("respuesta api: $respuesta")
        return JSONObject(respuesta)
    }
}