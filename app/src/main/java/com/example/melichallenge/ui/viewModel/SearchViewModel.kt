package com.example.melichallenge.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.melichallenge.data.MeliChallengeRepository
import com.example.melichallenge.domain.GetSearchResultUseCase
import com.example.melichallenge.domain.model.Item
import com.example.melichallenge.domain.model.SearchRowMeliChallenge
import kotlinx.coroutines.launch

class SearchViewModel constructor(
        //private val repository: MeliChallengeRepository,
        private val getSearchResultUseCase: GetSearchResultUseCase
    ):ViewModel() {

    var items = MutableLiveData<List<SearchRowMeliChallenge>?>()

    fun getItems(search:String){
        println("entro a get items ")

        viewModelScope.launch {
           /* var response=repository.getSearchResponse(search)
            if(response.isEmpty()){
                println("No hay resultados en la lista ")
            }else{

                println("Hay resultados en la lista ")
            }
            items.postValue(response)*/
            val result = getSearchResultUseCase.invoke(search)
            if(!result.isNullOrEmpty()){
                items.postValue(result)
            }else{
                if(result.isEmpty()){
                    items.postValue(emptyList())
                }
            }
        }
    }
}