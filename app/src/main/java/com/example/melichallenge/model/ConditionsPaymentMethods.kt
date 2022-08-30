package com.example.melichallenge.model

import android.app.BackgroundServiceStartNotAllowedException
import kotlinx.serialization.Serializable

@Serializable
data class ConditionsPaymentMethods (
    val allowed_methods:List<itemAllowedMethod>
        )
