package com.example.materialepladsenappui.Database_Connection

import android.os.StrictMode
import android.util.Log
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

//The class that establishes a connection to the database.
class DatabaseConnection {
    // JDBC URL and credentials for connecting to the database
    private val url = "jdbc:sqlserver://152.115.71.190:48123;databaseName=materialepladsen_core_DTUMP2"
    private val user = "DTUMP2"
    private val password = "mxDEKrZ8c2"

    // Method to get an connection to the database
    fun getConnection(): Connection? {
        // Set the thread policy to allow all connections
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        // Initialize the connection and connection string variables
        var conn: Connection? = null
        var connString: String? = null
        try {
            // Set the connection string for the alternative connection
            connString = "jdbc:jtds:sqlserver://152.115.71.190:48123;database=materialepladsen_core_DTUMP2;user=DTUMP2;password=mxDEKrZ8c2;"
            // Attempt to get the connection using the DriverManager
            conn = DriverManager.getConnection(connString)
        } catch (ex: SQLException) {
            // Log any SQL exceptions that occur
            ex.message?.let { Log.e("Error : ", it) }
        } catch (ex1: ClassNotFoundException) {
            // Log any ClassNotFoundExceptions that occur
            ex1.message?.let { Log.e("Error : ", it) }
        } catch (ex2: java.lang.Exception) {
            // Log any other exceptions that occur
            ex2.message?.let { Log.e("Error : ", it) }
        }
        // Return the connection (null if an exception occurred)
        return conn
    }
}





