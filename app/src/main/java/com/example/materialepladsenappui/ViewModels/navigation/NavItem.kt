package com.example.materialepladsenappui

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavItem(

    @StringRes val title: Int,
    val icon: ImageVector,
    val navRoute: String
) {
    object Home : NavItem(R.string.home, Icons.Default.Home, "home")
    object Orders : NavItem(R.string.order, Icons.Default.List, "order history")
    object Buy : NavItem(R.string.buy, Icons.Default.ShoppingCart, "starting weight")
    object More : NavItem(R.string.more, Icons.Default.MoreVert, "more page")


}