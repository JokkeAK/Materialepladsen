package com.example.materialepladsenappui

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontVariation.width
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


//The header in our app that contains the logo of Materialepladsen and is a button that can be pressed to get to
//the home page.
@Composable
public fun Header(navController: NavHostController? = null) {

    androidx.compose.material3.Button(
        onClick = {navController?.navigate("home")},
        contentPadding = PaddingValues(0.dp),
        shape = RectangleShape,
        modifier = Modifier
            .size(210.dp, 60.dp)
            .background(Color.White, shape = RoundedCornerShape(bottomStart = 25.dp, bottomEnd = 25.dp)),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        )
    ) {


            Image(
                painter = painterResource(id = R.drawable.mp_logo_header),
                contentDescription = "materialepladsen logo",
                modifier = Modifier
                    .size(200.dp, 56.dp),
                alignment = Alignment.Center
            )
        }
    }
