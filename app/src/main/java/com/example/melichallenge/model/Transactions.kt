package com.example.melichallenge.model

import com.example.melichallenge.model.Ratings
import kotlinx.serialization.Serializable

@Serializable
data class Transactions (
    val canceled: Int,
    val period: String,
    val total:Int,
    val ratings: Ratings,
    val completed:Int
)