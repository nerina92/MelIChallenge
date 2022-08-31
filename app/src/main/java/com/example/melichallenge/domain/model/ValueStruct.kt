package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class ValueStruct (
    val number:Double,
    val unit:String
        )
