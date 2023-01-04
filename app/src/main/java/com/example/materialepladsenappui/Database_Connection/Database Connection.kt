package com.example.materialepladsenappui.Database_Connection

import java.sql.Connection
import java.sql.DriverManager

class DatabaseConnection {
    private val url = "jdbc:sqlserver://<152.115.71.190>:<48123>;databaseName=<database>"
    private val user = "<DTUMP2>"
    private val password = "<mxDEKrZ8c2>"

    fun getConnection(): Connection {
        return DriverManager.getConnection(url, user, password)
    }
}