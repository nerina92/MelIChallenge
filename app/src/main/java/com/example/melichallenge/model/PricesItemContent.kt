package com.example.melichallenge.model

import kotlinx.serialization.Serializable

@Serializable
data class PricesItemContent (
    val id: String,
    val prices: List<Price>,
    val presentation: DisplayCurrency,
    val payment_method_prices: List<String>,//ver que tipo es, porque esta vacia
    val reference_prices:List<ReferencePrice>,
    val purchase_discounts: List<String>)

@Serializable
data class DisplayCurrency (
    val display_currency:String)


