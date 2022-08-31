package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class PurchaseDiscounts (
    val purchase_discount_id:String,
    val campaign_id: String,
    val rebate_id:String,
    val type:String,
    val discount_percentage:Double,
    val conditions:ConditionsPurchaseDiscounts,
    val purchase_min_amount: Double,
    val max_discount_amount: Double,
    val max_benefit_count: Int,
    val funding_mode: String
        )
