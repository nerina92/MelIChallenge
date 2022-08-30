package com.example.melichallenge.model

import com.example.melichallenge.model.IdNameObject
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
