package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Locations (
    val country:IdNameObject,
    val city:IdNameObject
        )
