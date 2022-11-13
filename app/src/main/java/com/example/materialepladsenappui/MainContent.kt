package com.example.composenavigation.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.materialepladsenappui.*

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
                startDestination = "home",
            ){
                composable("home"){
                    HomePage(navController)
                }
                composable("starting weight"){
                    StartingWeight(weight = 250, navController)
                }
                composable("buy on site"){
                    BuyOnSite(navController)
                }
                composable("order page"){
                    OrderPage(
                        "Granit grå 11-16 mm ",
                        "DKK 0.8/kg",
                        "Granit i grå med lille rød nist. Velegnet til indkørsler. Pynt i haver.",
                        585,
                        2825,
                        2825 - 585,
                        1792.0,
                        navController)
                }
                composable("payment"){
                    Payment(licensePlate = "CU342I2", navController)
                }
                composable("login"){ //not used now, should this be the home page on startup?
                    Login(navController)
                }
                composable("sign up private"){ //not used now
                    SignUp(navController)
                }
                composable("order history"){
                    OrderHistory(navController)
                }
                composable("receipt"){
                    Receipt(
                        "07/11-2022",
                        4034.50,
                        navController)
                }
                composable("more page"){
                    MorePage(navController)
                }
                composable("loader"){
                    Loader(navController)
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