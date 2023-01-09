package com.example.materialepladsenappui.Models

import java.math.BigDecimal
import java.util.Date

data class OrdersModel(
    val orderID: Int,
    val orderNumber: Int,
    val siteID: Int,
    val siteName: String,
    val typeID: Int,
    val typeName: String,
    val stateID: Int,
    val state: String,
    val created: Date,
    val closed: Date,
    val visitTime: Int,
    val weightIn: Int,
    val weightOut: Int,
    val paymentMethod: String,
    val paymentPriceInVAT: BigDecimal,
    val paymentPriceExVAT: BigDecimal,
    val paymentPriceVAT: BigDecimal
)