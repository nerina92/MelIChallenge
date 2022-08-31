package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Seller_address (
    val id: String,
    val comment: String,
    val address_line: String,
    val zip_code: String,
    val country: IdNameObject,
    val state: IdNameObject,
    val city: IdNameObject,
    val latitude: String,
    val longitude: String,
        )
