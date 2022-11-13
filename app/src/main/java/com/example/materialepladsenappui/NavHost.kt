package com.example.materialepladsenappui

import androidx.compose.runtime.Composable
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.selects.select

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
        navbar()}
        ) { innerPadding ->
        NavHost(navController = navController, startDestination = Routes.Landing.name,
            modifier = Modifier.padding(innerPadding)) {
                composable(route = Routes.Landing.name) {
                HomePage()
            }
        }


    }
}








fun navbar() {

}
