package com.example.materialepladsenappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composenavigation.ui.MainContent
import com.example.materialepladsenappui.Database_Connection.DBHelper
import android.util.Log
import com.example.materialepladsenappui.json.JsonDeserializer
import kotlinx.coroutines.*


class MainActivity : ComponentActivity() {
    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        GlobalScope.async {
            val dbhelper = DBHelper()
            Log.i("hello", "main:ahhhhhhhhhhhh ")
            dbhelper.Select()
            val json = JsonDeserializer()
            json.test() }

        setContent {
            MainContent()
        }
    }
}

