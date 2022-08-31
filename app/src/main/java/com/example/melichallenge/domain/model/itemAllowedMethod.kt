package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class itemAllowedMethod (
    val id:String,
    val issuer_id:String?,
    val payment_type_id:String,
    val installments: Installments?
        )