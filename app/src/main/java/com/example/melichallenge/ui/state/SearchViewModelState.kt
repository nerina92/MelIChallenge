package com.example.melichallenge.ui.state

import com.example.melichallenge.model.Item

data class SearchViewModelState (
    var itemList:List<Item> = emptyList(),
    var onLoading: Boolean=false
        )