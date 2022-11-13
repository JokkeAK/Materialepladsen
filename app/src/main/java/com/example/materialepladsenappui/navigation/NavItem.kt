package com.example.materialepladsenappui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavItem(

    @StringRes val title: Int,
    val icon: ImageVector,
    val navRoute: String
){
    object Home: NavItem(R.string.home, Icons.Default.Home, "HOME")
    object Orders: NavItem(R.string.order, Icons.Default.List, "LIST")
    object Buy: NavItem(R.string.buy, Icons.Default.ShoppingCart, "CART")
    object More: NavItem(R.string.more, Icons.Default.MoreVert, "MORE")




}