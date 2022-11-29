package com.example.materialepladsenappui

import androidx.compose.foundation.BorderStroke
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

//The button that is primarily used in the app with the classical bordeaux color that Materialepladsen use.
//Default route is "home" for the bordeaux buttons to prevent program from crashing.
@Composable
fun BordeauxButton(
    text: String,
    navController: NavHostController? = null,
    route: String = "home",
) {
    Button(
        onClick = { navController?.navigate(route) },
        modifier = Modifier
            .width(width = 260.dp)
            .height(height = 45.dp),
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = BRed,
            contentColor = Color.White
        ),
        border = BorderStroke(1.dp, Color.Black),
        elevation = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 5.dp,
            pressedElevation = 10.dp,
            disabledElevation = 0.dp
        )
    )
    {
        Text(
            text = text,
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }
}
