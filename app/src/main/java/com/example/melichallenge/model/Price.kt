package com.example.melichallenge.model

import com.example.melichallenge.model.Conditions
import kotlinx.serialization.Serializable

@Serializable
data class Price (
    val id: String,
    val type: String,
    val amount: Double,
    val regular_amount: Double?,
    val currency_id: String,
    val last_updated: String,
    val conditions: Conditions

        )
