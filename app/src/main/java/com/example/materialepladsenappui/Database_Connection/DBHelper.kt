package com.example.materialepladsenappui.Database_Connection

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import java.sql.Connection

class DBHelper {

fun Select(){
    val db = DatabaseConnection()
    val conn = db.getConnection()

    val query = "SELECT TOP (1000) [product_group]\n" +
            "      ,[id]\n" +
            "      ,[product_articlenumber]\n" +
            "      ,[product_articleName]\n" +
            "      ,[product_size]\n" +
            "      ,[product_WeightM3]\n" +
            "      ,[product_price_dkk_excludingTax]\n" +
            "      ,[product_price_dkk_includingTax]\n" +
            "      ,[unit]\n" +
            "      ,[availability]\n" +
            "      ,[product_image]\n" +
            "  FROM [materialepladsen_core_DTUMP2].[dbo].[v_mobileApp_products]"

    val stmt = conn.createStatement()
    val rs = stmt.executeQuery(query)

    while (rs.next()) {
        val tableName = rs.getString("TABLE_NAME")
        Log.i("tables", tableName)
    }
}

}