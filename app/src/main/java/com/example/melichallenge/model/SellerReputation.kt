package com.example.melichallenge.model

import kotlinx.serialization.Serializable

@Serializable
data class SellerReputation(
    val power_seller_status: String,
    val level_id: String,
    val metrics: Metrics,
    val transactions: Transactions
)
