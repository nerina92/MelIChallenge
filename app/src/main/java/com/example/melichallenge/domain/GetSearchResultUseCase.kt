package com.example.melichallenge.domain

import com.example.melichallenge.data.MeliChallengeRepository
import com.example.melichallenge.domain.model.Item
import com.example.melichallenge.domain.model.SearchRowMeliChallenge

class GetSearchResultUseCase constructor(private val repository: MeliChallengeRepository){
    suspend operator fun invoke(s: String):List<SearchRowMeliChallenge> {
        val items = repository.getSearchResponse(s)
        return if(items.isNotEmpty()){
            items
        }else{
            emptyList()
        }
    }
}
