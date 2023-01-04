package com.example.materialepladsenappui.Database_Connection

import java.sql.Connection
import java.sql.DriverManager

//The class that establishes a connection to the database.
class DatabaseConnection {
    private val url = "jdbc:sqlserver://152.115.71.190:48123/materialepladsen_core_DTUMP2"
    private val user = "DTUMP2"
    private val password = "<mxDEKrZ8c2>"

    //A method that gets a connection to the database.
    fun getConnection(): Connection {
        return DriverManager.getConnection(url, user, password)
    }
}