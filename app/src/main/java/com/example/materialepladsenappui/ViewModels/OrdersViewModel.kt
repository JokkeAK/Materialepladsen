package com.example.materialepladsenappui.ViewModels

import com.example.materialepladsenappui.Models.OrdersModel

class OrdersViewModel(private val orders: List<OrdersModel>) {

    val orderList: List<OrdersModel>
        get() = orders
}