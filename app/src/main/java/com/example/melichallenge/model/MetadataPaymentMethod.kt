package com.example.melichallenge.model

import kotlinx.serialization.Serializable

@Serializable
data class MetadataPaymentMethod (
    val purchase_discount_id:String,
    val purchase_discount_type:String,
    val purchase_discount_campaign_id:String,
    val purchase_discount_rebate_id:String
        )