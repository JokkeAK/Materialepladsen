package com.example.materialepladsenappui.Models

data class OrdersModel(
    val orderID: Long,
    val orderNumber: String,
    val siteID: Long,
    val siteName: String,
    val typeID: Long,
    val typeName: String,
    val stateID: Long,
    val state: String,
    val created: String,
    val closed: String,
    val visitTime: String,
    val weightIn: Double,
    val weightOut: Double,
    val paymentMethod: String,
    val paymentPriceInVAT: Double,
    val paymentPriceExVAT: Double,
    val paymentPriceVAT: Double
)