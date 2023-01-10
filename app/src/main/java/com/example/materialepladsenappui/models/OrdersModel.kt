package com.example.materialepladsenappui.models

import com.google.gson.annotations.SerializedName
import java.math.BigDecimal
import java.util.Date

data class OrdersModel(
     @SerializedName("Created") var Created: String,
     @SerializedName("Closed") var Closed: String,
     @SerializedName("Site") var Site: String,
     @SerializedName("SiteId") var SiteId: Int,
     @SerializedName("TypeId") var TypeId: Int,
     @SerializedName("Licenseplate") var Licenseplate: String,
     @SerializedName("WeightUnit") var WeightUnit: String = "Kg.",
     @SerializedName("WeightIn") var WeightIn: Int,
     @SerializedName("WeightOut") var WeightProduct: Int,
     @SerializedName("OrderNumber") var OrderNumber: Int,
     @SerializedName("CustomerId") var CustomerId: Int,
     @SerializedName("Description") var Description: String,
     @SerializedName("ErrCode") var ErrCode: Int,
     @SerializedName("QueueStateId") var QueueStateId: Int,


)