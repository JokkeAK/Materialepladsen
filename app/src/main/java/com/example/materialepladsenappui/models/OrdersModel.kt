package com.example.materialepladsenappui.models

import java.math.BigDecimal
import java.util.Date

data class OrdersModel(
     var Created: Date,
     var Closed: Date,
     var Site: String,
     var SiteID: Int,
     var TypeId: Int,
     var Licenseplate: String,
     val WeightUnit: String = "Kg.",
     var WeightIn: Int,
     var WeightProduct: Int,
     var OrderNumber: Int,
     var CustomerId: Int,
     var Description: String,
     var ErrCode: Int,
     var QueueStateId: Int,
)