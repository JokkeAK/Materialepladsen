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
             Log.i("Conn", "Connection is closed")
         } else{
             Log.i("Conn","Connection is not closed " + conn.toString())
         }

     } else{
         Log.i("Conn","Connection is null")
     }

        val query = "SELECT [product_group] FROM [materialepladsen_core_DTUMP2].[dbo].[v_mobileApp_products]"

        val stmt = conn?.createStatement()
        Log.i("Conn","after statement")
        val rs = stmt?.executeQuery(query)
        Log.i("Conn", "after executeQuery")
        //val tableName = rs?.getString(1)
        Log.i("Conn", rs.toString())
        while(rs?.next()==true){
            Log.i("Conn", rs.getString(1))
        }
    }

}