package com.example.melichallenge.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.melichallenge.data.MeliChallengeRepository
import kotlinx.coroutines.launch
import org.json.JSONObject

class ItemDetailViewModel(private val repository: MeliChallengeRepository):ViewModel() {

    var item = MutableLiveData<JSONObject>()

fun getItemDetail(id:String){
    viewModelScope.launch {
        var response=repository.getDetailItem(id)
        if(response==null){
            println("No hay resultados en la lista ")
        }else{
            println("Hay resultados en la lista ")
        }
        item.postValue(response)
    }
}
}