@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.materialepladsenappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialepladsenappui.ui.theme.BRed


@Composable
public fun Loader(){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Header()
        Spacer(modifier = Modifier.height(height = 68.dp))
        Text(
            text = "\tSkan QR-kode for at åbne port",
            color = Color.Black,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            ))
        Spacer(modifier = Modifier.height(height = 68.dp))
        Image(
            painter = painterResource(id = R.drawable.qr),
            contentDescription = "QR123456789",
            modifier = Modifier
                .size(size = 275.dp),
            contentScale = ContentScale.Fit)

        Spacer(modifier = Modifier.height(height = 240.dp))

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(width = 250.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = BRed,
                contentColor = Color.White
            ), shape = RectangleShape
        ){
            Text(text = "Indstrutions Video",color = Color.White)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LoaderPreview() {
    Loader()
}