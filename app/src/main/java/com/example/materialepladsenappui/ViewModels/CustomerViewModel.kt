package com.example.materialepladsenappui.ViewModels

import com.example.materialepladsenappui.Models.CustomersModel

class CustomersViewModel(private val customers: List<CustomersModel>) {

    val customerList: List<CustomersModel>
        get() = customers
}