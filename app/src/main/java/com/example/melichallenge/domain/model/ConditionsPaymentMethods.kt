package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class ConditionsPaymentMethods (
    val allowed_methods:List<itemAllowedMethod>
        )
