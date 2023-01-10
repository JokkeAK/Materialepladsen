package com.example.materialepladsenappui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

//import com.example.materialepladsenappui.screens.MyApp

//This composable shows the user the available payment methods.
@Composable
public fun Payment(licensePlate: String, navController: NavHostController? = null) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Header()

        Spacer(modifier = Modifier.height(height = 100.dp))

        Text(
            text = stringResource(R.string.betaling_foretrukne),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(height = 50.dp))

        BordeauxButton(text = stringResource(R.string.betaling_plate), navController){}

        Spacer(modifier = Modifier.height(height = 25.dp))

        BordeauxButton(text = stringResource(R.string.betaling_kort), navController){}

        Spacer(modifier = Modifier.height(height = 25.dp))

        BordeauxButton(text = stringResource(R.string.betaling_mobile), navController){}

        Spacer(modifier = Modifier.height(height = 50.dp))

        Text(
            text = stringResource(R.string.nummerplade) + "\n" + licensePlate,
            Modifier
                .background(Color.Gray, RectangleShape)
                .padding(10.dp)
                .width(280.dp),
            Color.Black, fontSize = 25.sp, fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

    }
}

//Hard coded license plate.
@Preview(showBackground = true)
@Composable
fun BetalingPreview() {
    Payment("CU342I2")
}