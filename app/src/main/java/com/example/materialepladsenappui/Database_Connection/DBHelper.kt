package com.example.materialepladsenappui.Database_Connection

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import com.example.materialepladsenappui.Models.Customer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.sql.Connection

class DBHelper {
    // Method to select a record from the database
    fun Select() {
        // Create a DatabaseConnection object and get a connection
        val conn = getConn()
        // Set the query to select a record from the v_mobileApp_products table
        val query = "SELECT TOP (1) [product_group] FROM [materialepladsen_core_DTUMP2].[dbo].[v_mobileApp_products]"

        // Create a statement and execute the query
        val stmt = conn?.createStatement()
        Log.i("Conn", "after statement")
        val rs = stmt?.executeQuery(query)
        Log.i("Conn", "after executeQuery")

        // Log the result set
        Log.i("Conn", rs.toString())
        conn?.close()
    }

    fun createCustomer(customer: Customer){
        // Create a DatabaseConnection object and get a connection
        val conn = getConn()

        val query = "DECLARE @return_value int,\n" +
                " @output_customer_number int,\n" +
                " @output_customer_guid uniqueidentifier,\n" +
                " @output_customer_cardNumber int,\n" +
                " @output_resultMessage nvarchar(100),\n" +
                " @output_exceptionMessage nvarchar(1000)\n" +
                "\n" +
                "EXEC @return_value = [dbo].[usp_customer_add] \n" +
                "@input_customer_firstName = N'${customer.customerFirstName}',\n" +
                " @input_customer_lastName = N'${customer.customerLastName}',\n" +
                " @input_customer_address = NULL,\n" +
                " @input_customer_postalcode = N'${customer.customerPostalcode}',\n" +
                " @input_customer_city = N'${customer.customerCity}',\n" +
                " @input_customer_phone = N'${customer.customerPhone}',\n" +
                " @input_customer_mobile = N'${customer.customerMobile}',\n" +
                " @input_customer_email = N'${customer.customerEmail}',\n" +
                " @input_customer_password = N'${customer.customerPassword}',\n" +
                " @input_customer_cardtag = N'NULL',\n" +
                " @input_customer_licensplate = N'${customer.licensplate}',\n" +
                " @output_customer_number = @output_customer_number OUTPUT,\n" +
                " @output_customer_guid = @output_customer_guid OUTPUT,\n" +
                " @output_customer_cardNumber = @output_customer_cardNumber OUTPUT,\n" +
                " @output_resultMessage = @output_resultMessage OUTPUT,\n" +
                " @output_exceptionMessage = @output_exceptionMessage OUTPUT\n" +
                "\n" +
                "SELECT @output_customer_number as N'@output_customer_number',\n" +
                " @output_customer_guid as N'@output_customer_guid',\n" +
                " @output_customer_cardNumber as N'@output_customer_cardNumber',\n" +
                " @output_resultMessage as N'@output_resultMessage',\n" +
                " @output_exceptionMessage as N'@output_exceptionMessage'\n" +
                "SELECT 'Return Value' = @return_value"

        // Create a statement and execute the query
        val stmt = conn?.createStatement()
        val rs = stmt?.executeQuery(query)
        // Log the result set
        Log.i("Conn", rs.toString())
        conn?.close()
    }

    fun getConn(): Connection? {
        // Create a DatabaseConnection object and get a connection
        val db = DatabaseConnection()
        val conn = db.getConnection()

        // Check if the connection is not null and not closed
        if (conn != null) {
            if (conn.isClosed) {
                Log.i("Conn", "Connection is closed")
            } else {
                Log.i("Conn", "Connection is not closed " + conn.toString())
            }
        } else {
            Log.i("Conn", "Connection is null")
        }
        return conn
    }
}