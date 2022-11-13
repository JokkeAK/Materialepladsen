package com.example.materialepladsenappui

import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavBar(
    navController: NavController
) {
    val navItems = listOf(NavItem.Home, NavItem.Orders, NavItem.Buy, NavItem.More)

    NavigationBar(
        containerColor = Color.White
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        navItems.forEach{item ->
        NavigationBarItem(
            icon = { Icon(imageVector = item.icon, contentDescription = "") },
            label = { Text(text = stringResource(id = item.title))},
            selected = currentRoute == item.navRoute,
            onClick = { navController.navigate(item.navRoute) }
        )

    }

}

}



