package com.example.composenavigation.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.materialepladsenappui.*

//The content of the app with all of the possible screens as composables with their defined routes.
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainContent() {
    val navController = rememberNavController()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {

        Scaffold(
            bottomBar = { BottomNavBar(navController = navController) }
        ) {
            NavHost(
                navController = navController,
                startDestination = "login",
            ) {
                composable("home") {
                    HomePage(navController)
                }
                composable("starting weight") {
                    StartingWeight(weight = 250, navController)
                }
                composable("buy on site") {
                    BuyOnSite(navController)
                }
                composable("order page") {
                    OrderPage(navController)
                }
                composable("payment") {
                    Payment(licensePlate = "CU342I2", navController)
                }
                composable("login") {
                    Login(navController)
                }
                composable("sign up p1") {
                    SignUpP1(navController)
                }
                composable("sign up p2") {
                    SignUpP2(navController)
                }
                composable("order history") {
                    OrderHistory(navController)
                }
                composable("receipt") {
                    Receipt(navController)
                }
                composable("more page") {
                    MorePage(navController)
                }
                composable("loader") {
                    Loader(navController)
                }
                composable("mat info") {
                    MatInfo(navController)
                }
                composable("mat info receipt") {
                    MatInfo(navController)
                }
            }
        }
    }
}


@Preview
@Composable
fun MainPreview() {
    MainContent()
}