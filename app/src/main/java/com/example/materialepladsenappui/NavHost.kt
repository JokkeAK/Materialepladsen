package com.example.materialepladsenappui

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class Routes() {
    Landing,
    MorePage,
    BuyOnSite,
    Reciepts
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun navBar(){

    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
        navigationbar()}
        ) { innerPadding ->
        NavHost(navController = navController, startDestination = Routes.Landing.name,
            modifier = Modifier.padding(innerPadding)) {
                composable(route = Routes.Landing.name) {
                HomePage()
            }
        }


    }
}








private fun navigationbar() {

}
