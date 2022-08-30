package com.example.melichallenge.model

import kotlinx.serialization.Serializable
import org.json.JSONObject

@Serializable
data class PricesItemContent (
    val id: String,
    val prices: List<Price>,
    val presentation: DisplayCurrency,
    val payment_method_prices: List<PaymentMethod>,
    val reference_prices:List<ReferencePrice>,
    val purchase_discounts: List<PurchaseDiscounts>)

@Serializable
data class DisplayCurrency (
    val display_currency:String)


