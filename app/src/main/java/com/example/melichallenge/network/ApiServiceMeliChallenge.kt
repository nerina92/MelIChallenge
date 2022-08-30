package com.example.melichallenge.network

import com.example.melichallenge.data.InterfazMeliChallRepository
import com.example.melichallenge.model.Item
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject

class ApiServiceMeliChallenge(private val interfazMeliChallRepository: InterfazMeliChallRepository) {

    suspend fun getItemsSearchResponse(search:String): List<Item>{
        return withContext(Dispatchers.IO){
            val response = interfazMeliChallRepository.getSearchResponse(search)
            (response.body()?.results ?: emptyList())
        }
    }

    suspend fun getItemDetail(id:String):String{
        return withContext(Dispatchers.IO){
            val response = interfazMeliChallRepository.getItemDetail(id)
            response.body()?.let { it
                it.string()
            }?: kotlin.run {
                ""
            }
        }
    }
}