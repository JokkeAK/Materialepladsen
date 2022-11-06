package com.example.materialepladsenappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialepladsenappui.ui.theme.BRed

@Composable
public fun Betaling(licensePlate: String){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Header()

        Spacer(modifier = Modifier.height(height = 100.dp))
        
        Text(text = stringResource(R.string.betaling_foretrukne), fontSize = 20.sp, fontWeight = FontWeight.Bold)
        
        Spacer(modifier = Modifier.height(height = 50.dp))
        
        BordeauxButton(text = stringResource(R.string.betaling_plate))

        Spacer(modifier = Modifier.height(height = 25.dp))
        
        BordeauxButton(text = stringResource(R.string.betaling_kort))

        Spacer(modifier = Modifier.height(height = 25.dp))
        
        BordeauxButton(text = stringResource(R.string.betaling_mobile))

        Spacer(modifier = Modifier.height(height = 50.dp))

        Text(text = stringResource(R.string.nummerplade) + "\n" + licensePlate ,
            Modifier
                .background(Color.Gray, RectangleShape)
                .padding(10.dp)
                .width(280.dp),
            Color.Black, fontSize = 25.sp, fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center)

    }
}

//Hard coded license plate.
@Preview(showBackground = true)
@Composable
fun BetalingPreview() {
    MyApp {
        Betaling("CU342I2")
    }
}