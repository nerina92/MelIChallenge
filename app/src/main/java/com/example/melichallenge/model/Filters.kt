package com.example.melichallenge.model

import kotlinx.serialization.Serializable

@Serializable
data class Filters (
    val id: String,
    val name: String,
    val type: String,
    val values: List<FilterValues>
        )
