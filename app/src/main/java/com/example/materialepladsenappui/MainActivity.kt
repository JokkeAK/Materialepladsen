package com.example.materialepladsenappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composenavigation.ui.MainContent
import com.example.materialepladsenappui.Database_Connection.DBHelper
import kotlinx.coroutines.runBlocking
import android.util.Log


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        fun main(){
            runBlocking {

                val dbhelper = DBHelper()
                dbhelper.Select()

            }
        }

        setContent {
            MainContent()
        }
    }
}

