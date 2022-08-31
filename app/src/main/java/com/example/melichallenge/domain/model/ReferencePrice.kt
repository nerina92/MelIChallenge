package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class ReferencePrice (
    val id: String,
    val type: String,
    val conditions: Conditions,
    val amount: Double,
    val currency_id: String,
    val exchange_rate_context: String,
    val tags:List<String>,
    val last_updated: String)
