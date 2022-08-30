package com.example.melichallenge.model

import kotlinx.serialization.Serializable

@Serializable
data class Metrics (
    val cancellations: MetricContent,
    val claims: MetricContent,
    val delayed_handling_time: MetricContent,
    val sales: MetricSales
)
