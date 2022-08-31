package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Item(
    val id:String,
    val site_id:String,
    val title:String,
    val seller: Seller,
    val price:Double,
    val prices: PricesItemContent,
    val sale_price:Int?,//ver bien que tipo de dato es(puede ser null)
    val currency_id:String,
    val available_quantity:Int,
    val sold_quantity: Int,
    val buying_mode: String,
    val listing_type_id: String,
    val stop_time: String,
    val condition: String,
    val permalink: String,
    val thumbnail: String,
    val thumbnail_id: String,
    val accepts_mercadopago: Boolean,
    val installments: Installments,
    val address: Address,
    val shipping: Shipping,
    val seller_address: Seller_address,
    val attributes:List<Attribute>,
    val differential_pricing: Differential_pircing?,
    val original_price: String?,//ver bien si es double, puede ser null,
    val category_id: String,
    val official_store_id:String?,//ver bien si es String, puede ser null,
    val domain_id: String,
    val catalog_product_id:String?,
    val tags:List<String>,
    val catalog_listing:Boolean?,
    val use_thumbnail_id: Boolean,
    val offer_score:String?,//ver bien si es String, puede ser null,
    val offer_share:String?,//ver bien si es String, puede ser null,
    val match_score: String?,//ver bien si es String, puede ser null,
    val winner_item_id:String?,//ver bien si es String, puede ser null,
    val melicoin:String?,//ver bien si es String, puede ser null,
    val discounts:String?,//ver bien si es String, puede ser null,
    val order_backend: Int
)
