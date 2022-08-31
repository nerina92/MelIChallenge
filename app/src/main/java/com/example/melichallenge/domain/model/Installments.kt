package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Installments (
    val quantity: Int,
    val amount: Double,
    val rate: Double,
    val currency_id: String
)
