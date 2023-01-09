package com.example.materialepladsenappui.json
import android.util.Log
import com.example.materialepladsenappui.models.OrdersModel
import com.google.gson.Gson
import java.net.URL
class JsonDeserializer {



    fun test(){

        val webPage = URL(
            "http://152.115.71.190:41000/?user=DTUMP2&password=mxDEKrZ8c2&request=EC02E425-B6BD-4D82-A9A2-" +
                "F58507385B41&type=requestOrderNew&customerid=12537&licenseplate=DB22100")

        val data = webPage.readText()

        val gson = Gson()
        val td = gson.fromJson(data,OrdersModel ::class.java )

        Log.i("JSONTEST", data)


    }
}


