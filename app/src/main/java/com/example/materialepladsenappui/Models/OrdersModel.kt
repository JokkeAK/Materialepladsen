package com.example.materialepladsenappui.Models

import java.math.BigDecimal
import java.util.Date

data class OrdersModel(
    val OrderID: Int,
    val OrderNumber: Int,
    val SiteID: Int,
    val SiteName: String,
    val TypeID: Int,
    val TypeName: String,
    val StateID: Int,
    val State: String,
    val Created: Date,
    val Closed: Date,
    val VisitTime: Int,
    val WeightIn: Int,
    val WeightOut: Int,
    val PaymentMethod: String,
    val PaymentPriceInVAT: BigDecimal,
    val PaymentPriceExVAT: BigDecimal,
    val PaymentPriceVAT: BigDecimal
)