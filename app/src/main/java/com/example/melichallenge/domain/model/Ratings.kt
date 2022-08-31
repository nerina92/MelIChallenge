package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Ratings (
    val negative: Double ,
    val neutral: Double ,
    val positive: Double)
