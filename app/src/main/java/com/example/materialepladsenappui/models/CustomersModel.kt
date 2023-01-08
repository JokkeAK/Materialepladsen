package com.example.materialepladsenappui.models

data class CustomersModel(
    val customerNumber: Long,
    val customerGUID: String,
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
    val created: String,
    val createdBy: String,
    val modified: String,
    val modifiedBy: String,
    val archived: Boolean,
    val archivedBy: String
)

