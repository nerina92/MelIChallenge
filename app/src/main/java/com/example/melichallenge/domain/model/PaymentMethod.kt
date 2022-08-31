package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class PaymentMethod (
    val id:String,
    val conditions: ConditionsPaymentMethods,
    val value: Int,
    val type:String,
    val currency_id: String?,
    val metadata: MetadataPaymentMethod,
    val exchange_rate_context: String

        )