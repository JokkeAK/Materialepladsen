package com.example.materialepladsenappui.Database_Connection

import android.os.StrictMode
import android.util.Log
import java.sql.Connection
import java.sql.Driver
import java.sql.DriverManager
import java.sql.SQLException

//The class that establishes a connection to the database.
class DatabaseConnection {
    private val url = "jdbc:sqlserver://152.115.71.190:48123;databaseName=materialepladsen_core_DTUMP2"
    private val user = "DTUMP2"
    private val password = "mxDEKrZ8c2"

    //A method that gets a connection to the database.
    fun getConnection(): Connection {
        return DriverManager.getConnection(url, user, password)

    }

    fun getAltConnection() : Connection?{
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        var conn : Connection? = null
        var connString : String? = null
        try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
           // connString =
                //"jdbc:jtds:sqlserver://152.115.71.190:48123;databaseName=materialepladsen_core_DTUMP2;user=DTUMP2;password=mxDEKrZ8c2;"

           // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
            connString = "jdbc:jtds:sqlserver://152.115.71.190:48123;database=materialepladsen_core_DTUMP2;user=DTUMP2;password=mxDEKrZ8c2;"

            conn = DriverManager.getConnection(connString)
        }
        catch (ex : SQLException) {
            ex.message?.let { Log.e("Error : ", it) }
        } catch (ex1 : ClassNotFoundException) {
            ex1.message?.let { Log.e("Error : ", it) }
        } catch (ex2 : java.lang.Exception) {
            ex2.message?.let { Log.e("Error : ", it) }
        }


        return conn
        }
    }

