package com.example.materialepladsenappui.Models

import java.util.Date

data class CustomersModel(
    val customerNumber: Int,
    val customerGUID: Int,
    val customerFirstName: String,
    val customerLastName: String,
    val customerAddress: String,
    val customerPostalcode: String,
    val customerCity: String,
    val customerPhone: String,
    val customerMobile: String,
    val customerEmail: String,
    val customerPassword: String,
    val cardNumber: String,
    val licensplate: String,
    val created: Date,
    val createdBy: Date,
    val modified: Date,
    val modifiedBy: String,
    val archived: Date,
    val archivedBy: String
)

