package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Transactions (
    val canceled: Int,
    val period: String,
    val total:Int,
    val ratings: Ratings,
    val completed:Int
)