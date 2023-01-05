package com.example.materialepladsenappui.Database_Connection

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.sql.Connection

class DBHelper {

 fun Select() {
        val db = DatabaseConnection()
        val conn = db.getAltConnection()
     if (conn != null) {
         if(conn.isClosed){
             Log.i("connection", "Connection is closed")
         }
     }

        val query = "SELECT TOP (1) [product_group]\n" +
                "FROM [materialepladsen_core_DTUMP2].[dbo].[v_mobileApp_products]"

        val stmt = conn?.createStatement()
        val rs = stmt?.executeQuery(query)
        val tableName = rs?.getString("TABLE_NAME")
        Log.i("tables", "tableName")
    }

}