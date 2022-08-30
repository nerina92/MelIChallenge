package com.example.melichallenge.model

import kotlinx.serialization.Serializable

@Serializable
data class SearchResponse(
    val site_id:String,
    val country_default_time_zone:String,
    val query:String,
    val paging: Paging,
    val results: List<Item>,
    val sort: IdNameObject,
    val available_sorts:List<IdNameObject>,
    val filters:List<Filters>,
    val available_filters:List<Filters>,
)
