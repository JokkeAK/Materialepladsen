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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialepladsenappui.ui.theme.BRed

@Composable
public fun Betaling(){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Header()

        Spacer(modifier = Modifier.height(height = 155.dp))
        
        Text(text = "Vælg din fortrukne betalingsmetode", fontWeight = FontWeight.Bold)
        
        Spacer(modifier = Modifier.height(height = 50.dp))

        Button(onClick = { /*TODO*/ },
        modifier = Modifier.width(width = 250.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = BRed,
            contentColor = Color.White
        ), shape = RectangleShape
        ){
            Text(text = "Pay By Plate",color = Color.White)
        }

        Spacer(modifier = Modifier.height(height = 25.dp))

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(width = 250.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = BRed,
                contentColor = Color.White
            ), shape = RectangleShape
        ){
            Text(text = "Betalingskort",color = Color.White)
        }

        Spacer(modifier = Modifier.height(height = 25.dp))

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(width = 250.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = BRed,
                contentColor = Color.White
            ), shape = RectangleShape
        ){
            Text(text = "Mobilepay",color = Color.White)
        }
        
        Spacer(modifier = Modifier.height(height = 200.dp))

        Text("Nummerplade",Modifier.background(
            Color.Gray, RectangleShape
        ),Color.Black, fontSize = 25.sp, fontWeight = FontWeight.Bold)

    }
}