package com.example.materialepladsenappui.json

import android.util.Log
import com.example.materialepladsenappui.models.OrdersModel
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName
import java.net.URL
import java.util.*

data class OrderOngoing(
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
data class test(
    var number: Int
)

class JsonDeserializer {
    fun requestNewOrder(CustomerId: Int, Licenseplate: String): OrdersModel? {

        val webPage = URL(
            "http://152.115.71.190:41000/?user=DTUMP2&password=mxDEKrZ8c2&request=EC02E425-B6BD-4D82-A9A2-F58507385B41&type=requestOrderNew&customerid=$CustomerId&licenseplate=$Licenseplate"
        )
        val data = webPage.readText()
        Log.i("JSON", data)
        val gson = Gson()
       return gson.fromJson(data, OrdersModel::class.java)


    }
    fun requestWeight(CustomerId: Int, Licenseplate: String, OrderNumber: Int): OrdersModel?{
        val webPage =URL(
            "http:// 152.115.71.190:41000/?user=DTUMP2&password=mxDEKrZ8c2&request=412084F3-98C2-48BA-A322-5CFDCD4E5410&type=requestOrderWeighing&customerid=$CustomerId&licenseplate=$Licenseplate&ordernumber=$OrderNumber"
        )
        val data = webPage.readText()
        Log.i("JSON", data)
        val gson = Gson()
      val  weight = gson.fromJson(data, OrdersModel::class.java)
        Log.i("JSON", weight.toString())
        return weight

    }
    fun requestPayment(){

    }
    fun requestBarrier(){

    }
    fun requestweight(){

    }
}


