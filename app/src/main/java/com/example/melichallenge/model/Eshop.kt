package com.example.melichallenge.model

import kotlinx.serialization.Serializable

@Serializable
data class Eshop (
    val seller: Int,
    val eshop_rubro: EshopRubro?,// ver si es String, puede ser null,
    val eshop_id: Int,
    val nick_name: String,
    val site_id: String,
    val eshop_logo_url: String,
    val eshop_status_id: Int,
    val eshop_experience: Int,
    val eshop_locations: List<Locations>//Ver si es de strings la lista--- en este ejemplo estaba vacia
)
