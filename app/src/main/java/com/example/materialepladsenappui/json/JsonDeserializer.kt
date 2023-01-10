package com.example.materialepladsenappui.json

import android.util.Log
import com.example.materialepladsenappui.models.Order
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import java.net.URL

// a small helper dataclasss to keep see whether the barrier was opened succesfully
// it corresponds to the Json object returned by the webservice
data class Barrier(
    @SerializedName("Description") var desc: String,
    @SerializedName("ErrCode") var errcode: String,
    @SerializedName("Command") var command: String,
    @SerializedName("CommandGuid") var cmdGUID: Int,

    )

//our main class for http calls to the webservice
class JsonDeserializer {
    //makes a new order
    fun requestNewOrder(CustomerId: Int, Licenseplate: String): Order? {

        val webPage = URL(
            "http://152.115.71.190:41000/?user=DTUMP2&password=mxDEKrZ8c2&request=EC02E425-B6BD-4D82-A9A2-F58507385B41&type=requestOrderNew&customerid=$CustomerId&licenseplate=$Licenseplate"
        )
        val data = webPage.readText()

        val gson = Gson()
        return gson.fromJson(data, Order::class.java)


    }

    fun requestWeight(CustomerId: Int, Licenseplate: String, OrderNumber: Int): Order? {
        val webPage = URL(
            "http://152.115.71.190:41000/?user=DTUMP2&password=mxDEKrZ8c2&request=412084F3-98C2-48BA-A322-5CFDCD4E5410&type=requestOrderWeighing&customerid=$CustomerId&licenseplate=$Licenseplate&ordernumber=$OrderNumber"
        )
        val data = webPage.readText()

        val gson = Gson()

        return gson.fromJson(data, Order::class.java)

    }
// function for getting the payment
    fun requestPayment(CustomerId: Int, Licenseplate: String, OrderNumber: Int): Order? {
        val webPage = URL(
            "http://152.115.71.190:41000/?user=DTUMP2&password=mxDEKrZ8c2&request=DCA382A0-F943-4A76-AE8ECF894E2B2A7B& type=requestOrderPayment&customerid=$CustomerId&licenseplate=$Licenseplate&order number=$OrderNumber"
        )
        val gson = Gson()
        val data = webPage.readText()


        return gson.fromJson(data, Order::class.java)
    }

    fun requestBarrier(SiteId: Int): Barrier? {
        val webPage = URL(
            "http://152.115.71.190:41000/?user=DTUMP2&password=mxDEKrZ8c2&&type=requestIOCbarrier&request=79F" +
                    "D22F6-66DD-4249-810C-839C28130C11&site=$SiteId"
        )
        val gson = Gson()
        val data = webPage.readText()
        return gson.fromJson(data, Barrier::class.java)

    }
}

