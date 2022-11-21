@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.materialepladsenappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

//This composable is where we eventually will generate a QR-code that can be scanned for
//access to the loading machine
@Composable
public fun Loader(navController: NavHostController? = null) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header()
        Spacer(modifier = Modifier.height(height = 68.dp))
        Text(
            text = "\tSkan QR-kode for at åbne port",
            color = Color.Black,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(height = 68.dp))
        Image(
            painter = painterResource(id = R.drawable.qr),
            contentDescription = "QR123456789",
            modifier = Modifier
                .size(size = 275.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(height = 240.dp))

        BordeauxButton(text = "Indstrutions Video", navController)
    }
}


@Preview(showBackground = true)
@Composable
fun LoaderPreview() {
    Loader()
}