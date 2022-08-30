package com.example.melichallenge.model

import kotlinx.serialization.Serializable

@Serializable
data class ValueStruct (
    val number:Double,
    val unit:String
        )
