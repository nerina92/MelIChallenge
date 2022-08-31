package com.example.melichallenge.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class ItemDetail(
    val id:String,
    val site_id:String,
    val title: String,
    val subtitle: String?,
    val seller_id:Int,
    val category_id:String,
    val official_store_id: String?,
    val price: Double,
    val base_price: Double,
    val original_price: Double?,
    val currency_id: String,
    val initial_quantity: Int,
    val available_quantity: Int,
    val sold_quantity: Int)/*,
    val sale_terms: List<SaleTerms>,



"buying_mode": "buy_it_now",
"listing_type_id": "gold_special",
"start_time": "2022-08-25T20:33:09.000Z",
"stop_time": "2042-08-20T04:00:00.000Z",
"condition": "new",
"permalink": "https://articulo.mercadolibre.com.ar/MLA-1158033280-cry-babies-fantasy-dreamy-imc-toys-99180im-_JM",
"thumbnail_id": "843969-MLA48269133730_112021",
"thumbnail": "http://http2.mlstatic.com/D_843969-MLA48269133730_112021-I.jpg",
"secure_thumbnail": "https://http2.mlstatic.com/D_843969-MLA48269133730_112021-I.jpg",
"pictures": [
{
    "id": "843969-MLA48269133730_112021",
    "url": "http://http2.mlstatic.com/D_843969-MLA48269133730_112021-O.jpg",
    "secure_url": "https://http2.mlstatic.com/D_843969-MLA48269133730_112021-O.jpg",
    "size": "407x500",
    "max_size": "606x744",
    "quality": ""
},
{
    "id": "652810-MLA48269205539_112021",
    "url": "http://http2.mlstatic.com/D_652810-MLA48269205539_112021-O.jpg",
    "secure_url": "https://http2.mlstatic.com/D_652810-MLA48269205539_112021-O.jpg",
    "size": "384x500",
    "max_size": "761x990",
    "quality": ""
}
],
"video_id": "Cy7RH3XvBeU",
"descriptions": [],
"accepts_mercadopago": true,
"non_mercado_pago_payment_methods": [],
"shipping": {
    "mode": "me2",
    "methods": [],
    "tags": [
    "self_service_in",
    "mandatory_free_shipping"
    ],
    "dimensions": null,
    "local_pick_up": true,
    "free_shipping": true,
    "logistic_type": "xd_drop_off",
    "store_pick_up": false
},
"international_delivery_mode": "none",
"seller_address": {
    "city": {
        "name": "Villa Ballester"
    },
    "state": {
        "id": "AR-B",
        "name": "Buenos Aires"
    },
    "country": {
        "id": "AR",
        "name": "Argentina"
    },
    "search_location": {
        "neighborhood": {
        "id": "TUxBQlZJTDE0Nzha",
        "name": "Villa Ballester"
    },
        "city": {
        "id": "TUxBQ0dFTmVyYWxz",
        "name": "General San Martín"
    },
        "state": {
        "id": "TUxBUEdSQWU4ZDkz",
        "name": "Bs.As. G.B.A. Norte"
    }
    },
    "id": 1095348136
},
"seller_contact": null,
"location": {},
"coverage_areas": [],
"attributes": [
{
    "id": "ACCESSORIES_INCLUDED",
    "name": "Accesorios incluidos",
    "value_id": "4945479",
    "value_name": "Chupete",
    "value_struct": null,
    "values": [
    {
        "id": "4945479",
        "name": "Chupete",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "ALPHANUMERIC_MODEL",
    "name": "Modelo alfanumérico",
    "value_id": "11445590",
    "value_name": "99180IM",
    "value_struct": null,
    "values": [
    {
        "id": "11445590",
        "name": "99180IM",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "BRAND",
    "name": "Marca",
    "value_id": "1141043",
    "value_name": "Cry Babies",
    "value_struct": null,
    "values": [
    {
        "id": "1141043",
        "name": "Cry Babies",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "CELL_BATTERY_SIZE",
    "name": "Tamaño de la pila",
    "value_id": "6073399",
    "value_name": "AAA",
    "value_struct": null,
    "values": [
    {
        "id": "6073399",
        "name": "AAA",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "CHARACTER",
    "name": "Personaje",
    "value_id": "11214152",
    "value_name": "Fantasy dreamy",
    "value_struct": null,
    "values": [
    {
        "id": "11214152",
        "name": "Fantasy dreamy",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "CHARACTER_GENDER",
    "name": "Género del personaje",
    "value_id": "11208053",
    "value_name": "Femenino",
    "value_struct": null,
    "values": [
    {
        "id": "11208053",
        "name": "Femenino",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "FUNCTIONS",
    "name": "Funciones",
    "value_id": "11208054",
    "value_name": "Llora",
    "value_struct": null,
    "values": [
    {
        "id": "11208054",
        "name": "Llora",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "GTIN",
    "name": "Código universal de producto",
    "value_id": null,
    "value_name": "08421134099180",
    "value_struct": null,
    "values": [
    {
        "id": null,
        "name": "08421134099180",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "HEIGHT",
    "name": "Altura",
    "value_id": "3104107",
    "value_name": "305 mm",
    "value_struct": {
    "number": 305,
    "unit": "mm"
},
    "values": [
    {
        "id": "3104107",
        "name": "305 mm",
        "struct": {
        "number": 305,
        "unit": "mm"
    }
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "INCLUDES_ACCESSORIES",
    "name": "Incluye accesorios",
    "value_id": "242085",
    "value_name": "Sí",
    "value_struct": null,
    "values": [
    {
        "id": "242085",
        "name": "Sí",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "INCLUDES_CELL_BATTERIES",
    "name": "Incluye pilas",
    "value_id": "242085",
    "value_name": "Sí",
    "value_struct": null,
    "values": [
    {
        "id": "242085",
        "name": "Sí",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "IS_ARTICULATED",
    "name": "Es articulada",
    "value_id": "242085",
    "value_name": "Sí",
    "value_struct": null,
    "values": [
    {
        "id": "242085",
        "name": "Sí",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "ITEM_CONDITION",
    "name": "Condición del ítem",
    "value_id": "2230284",
    "value_name": "Nuevo",
    "value_struct": null,
    "values": [
    {
        "id": "2230284",
        "name": "Nuevo",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "LENGHT",
    "name": "Largo",
    "value_id": "11211719",
    "value_name": "230 mm",
    "value_struct": {
    "number": 230,
    "unit": "mm"
},
    "values": [
    {
        "id": "11211719",
        "name": "230 mm",
        "struct": {
        "number": 230,
        "unit": "mm"
    }
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "MANUFACTURER",
    "name": "Fabricante",
    "value_id": "2268442",
    "value_name": "IMC Toys",
    "value_struct": null,
    "values": [
    {
        "id": "2268442",
        "name": "IMC Toys",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "MATERIALS",
    "name": "Materiales",
    "value_id": "2748302",
    "value_name": "Plástico",
    "value_struct": null,
    "values": [
    {
        "id": "2748302",
        "name": "Plástico",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "MIN_RECOMMENDED_AGE",
    "name": "Edad mínima recomendada",
    "value_id": "1259750",
    "value_name": "18 meses",
    "value_struct": {
    "number": 18,
    "unit": "meses"
},
    "values": [
    {
        "id": "1259750",
        "name": "18 meses",
        "struct": {
        "number": 18,
        "unit": "meses"
    }
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "MPN",
    "name": "MPN",
    "value_id": "11211722",
    "value_name": "99180IM",
    "value_struct": null,
    "values": [
    {
        "id": "11211722",
        "name": "99180IM",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "NUMBER_OF_DOLLS",
    "name": "Cantidad de muñecas",
    "value_id": "1259745",
    "value_name": "1",
    "value_struct": null,
    "values": [
    {
        "id": "1259745",
        "name": "1",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "WEIGHT",
    "name": "Peso",
    "value_id": "11211718",
    "value_name": "0.815 kg",
    "value_struct": {
    "number": 0.815,
    "unit": "kg"
},
    "values": [
    {
        "id": "11211718",
        "name": "0.815 kg",
        "struct": {
        "number": 0.815,
        "unit": "kg"
    }
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "WIDTH",
    "name": "Ancho",
    "value_id": "7809294",
    "value_name": "160 mm",
    "value_struct": {
    "number": 160,
    "unit": "mm"
},
    "values": [
    {
        "id": "7809294",
        "name": "160 mm",
        "struct": {
        "number": 160,
        "unit": "mm"
    }
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
},
{
    "id": "WITH_SOUND",
    "name": "Con sonido",
    "value_id": "242085",
    "value_name": "Sí",
    "value_struct": null,
    "values": [
    {
        "id": "242085",
        "name": "Sí",
        "struct": null
    }
    ],
    "attribute_group_id": "OTHERS",
    "attribute_group_name": "Otros"
}
],
"warnings": [],
"listing_source": "",
"variations": [],
"status": "active",
"sub_status": [],
"tags": [
"good_quality_picture",
"good_quality_thumbnail",
"immediate_payment",
"cart_eligible"
],
"warranty": "Garantía del vendedor: 10 días",
"catalog_product_id": "MLA15084428",
"domain_id": "MLA-DOLLS",
"parent_item_id": null,
"differential_pricing": null,
"deal_ids": [],
"automatic_relist": false,
"date_created": "2022-08-25T20:33:09.000Z",
"last_updated": "2022-08-29T17:11:03.000Z",
"health": null,
"catalog_listing": true,
"channels": [
"marketplace"
]
}
) */