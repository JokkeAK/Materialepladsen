package com.example.materialepladsenappui.ViewModels

import ProductModel


class ProductViewModel(private val productModel: ProductModel) {

    val productGroup: String
        get() = productModel.productGroup

    val id: Long
        get() = productModel.id

    val productArticleNumber: String
        get() = productModel.productArticleNumber

    val productArticleName: String
        get() = productModel.productArticleName

    val productSize: String
        get() = productModel.productSize

    val productWeight: Double
        get() = productModel.productWeight

    val productPriceExTAX: Double
        get() = productModel.productPriceExTAX

    val productPriceInTAX: Double
        get() = productModel.productPriceInTAX

    val unit: String
        get() = productModel.unit

    val availability: Boolean
        get() = productModel.availability

    val productImage: String
        get() = productModel.productImage
}
