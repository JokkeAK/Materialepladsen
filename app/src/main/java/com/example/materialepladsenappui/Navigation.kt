package com.example.materialepladsenappui

import androidx.compose.runtime.Composable
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Start" ){
    composable("Start"){
        MyScreenContent()
    }
    composable("Order"){
        MyScreenContent()
    }
    composable("Køb"){
        MyScreenContent()
    }
    composable("Mere"){
        MyScreenContent()
    }
    }
    
}