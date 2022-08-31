package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class MetricContent (
    val period: String,
    val rate: Double,
    val value: Int
)
