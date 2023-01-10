package com.example.materialepladsenappui.models

import java.util.Date

data class Customer(
    val customerNumber: Int?,
    val customerGUID: Int?,
    val customerFirstName: String,
    val customerLastName: String,
    val customerAddress: String?,
    val customerPostalcode: String,
    val customerCity: String,
    val customerPhone: String,
    val customerMobile: String,
    val customerEmail: String,
    val customerPassword: String,
    val cardNumber: String?,
    val licensplate: String,
    val created: Date?,
    val createdBy: String?,
    val modified: Date?,
    val modifiedBy: String?,
    val archived: Date?,
    val archivedBy: String?
)

