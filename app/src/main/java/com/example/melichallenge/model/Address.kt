package com.example.melichallenge.model

import kotlinx.serialization.Serializable

@Serializable
data class Address (
    val state_id: String,
    val state_name: String,
    val city_id: String?,
    val city_name:String
    )
