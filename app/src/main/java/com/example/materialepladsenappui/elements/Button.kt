package com.example.materialepladsenappui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

import com.example.materialepladsenappui.theme.BRed


@Composable //need to add a function for navigation.
fun BordeauxButton(text: String, route: String, navController: NavHostController? = null) {
    Button(onClick = {navController?.navigate(route)},
        modifier = Modifier
            .width(width = 260.dp)
            .height(height = 45.dp),
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = BRed,
            contentColor = Color.White),
        border = BorderStroke(1.dp, Color.Black)
        ,elevation =  ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 10.dp,
            pressedElevation = 10.dp,
            disabledElevation = 10.dp))
    {
        Text(
            text = text,
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
        )    }
}