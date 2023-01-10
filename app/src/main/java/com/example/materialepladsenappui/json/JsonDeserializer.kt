package com.example.materialepladsenappui.json

import android.util.Log
import com.example.materialepladsenappui.models.OrdersModel
import com.google.gson.GsonBuilder
import java.net.URL
import java.util.*

data class OrderOngoing(
    val Created: Date = Date(null),
    val Closed: Date = Date(null),
    val Site: String = "",
    val SiteId: Int =0,
    val TypeId: Int =0,
    var Licenseplate: String ="",
    val WeightUnit: String = "Kg.",
    var WeightIn: Int = 0,
    var WeightProduct: Int=0,
    var OrderNumber: Int=0,
    var CustomerId: Int=0,
    var Description: String= "",
    var ErrCode: Int=0,
    var QueueStateId: Int=0,

    )

class JsonDeserializer {
    fun fromJson(json: String): OrderOngoing {
        val builder = GsonBuilder()
        builder.setPrettyPrinting()
        Log.i("JSONTEST", "INSIDE")
       var Order =builder.create().fromJson(json, OrderOngoing::class.java)
        return Order
    }


    fun test() {

        val webPage = URL(
            "http://152.115.71.190:41000/?user=DTUMP2&password=mxDEKrZ8c2&request=EC02E425-B6BD-4D82-A9A2-F58507385B41&type=requestOrderNew&customerid=&licenseplate=BB11345"
        )
        Log.i("JSONTEST", "HOLD DIN KÆFT NOAH")
        val data = webPage.readText()

        Log.i("JSONTEST", data)
        Log.i("JSONTEST", "data")
       val ongoing = fromJson(data)

       // val td = Gson().fromJson(data, OrderOngoing::class.java)
       // Log.i("JSONTEST", td.toString())
        Log.i("JSON", "test: ")
        Log.i("JSONTEST", ongoing.WeightUnit)


    }
}


