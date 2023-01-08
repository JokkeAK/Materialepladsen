package com.example.materialepladsenappui.ViewModels

import com.example.materialepladsenappui.models.CustomersModel

class CustomersViewModel(private val customers: List<CustomersModel>) {

    val customerList: List<CustomersModel>
        get() = customers
}