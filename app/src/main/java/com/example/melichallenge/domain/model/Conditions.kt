package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Conditions (
    val context_restrictions: List<String>,
    val start_time: String?,
    val end_time: String?,
    val eligible: Boolean
    )
