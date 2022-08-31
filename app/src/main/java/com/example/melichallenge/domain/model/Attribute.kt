package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Attribute (
    val id: String?,
    val name: String,
    val value_struct:ValueStruct?,
    val attribute_group_name: String,
    val value_id: String?,
    val value_name: String?,
    val values: List <Values>,
    val attribute_group_id: String,
    val source: String
        )
