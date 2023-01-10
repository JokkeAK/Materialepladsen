package com.example.materialepladsenappui.Database_Connection

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.sql.Connection

class DBHelper {
    // Method to select a record from the database
    fun Select() {
        // Create a DatabaseConnection object and get a connection
        val db = DatabaseConnection()
        val conn = db.getConnection()

        // Check if the connection is not null and not closed
        if (conn != null) {
            if (conn.isClosed) {
                Log.i("TestConn", "Connection is closed")
            } else {
                Log.i("TestConn", "Connection is not closed " + conn.toString())
            }
        } else {
            Log.i("TestConn", "Connection is null")
        }

        // Set the query to select a record from the v_mobileApp_products table
        val query = "SELECT [product_group] FROM [materialepladsen_core_DTUMP2].[dbo].[v_mobileApp_products]"

        // Create a statement and execute the query
        val stmt = conn?.createStatement()
        Log.i("TestConn", "after statement")
        val rs = stmt?.executeQuery(query)
        Log.i("TestConn", "after executeQuery")

        // Log the result set
        Log.i("TestConn", rs.toString())
        while (rs?.next() == true){
            Log.i("TestConn",rs.getString(1))
        }
    }
}