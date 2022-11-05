package com.example.materialepladsenappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// All text is hardcoded. Needs to be changed.

@Composable
fun OrderInfoCard() {

    Card(
        shape = RectangleShape,
        modifier = Modifier
            .fillMaxWidth(),
    ) {


        Column(modifier = Modifier
            ){
            Text(
                text = "\t\tFlisegrus 0-8 mm",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )
            )


            Spacer(
                modifier = Modifier
                    .height(height = 10.dp)
            )


            Text(
                text = "\t\tKilopris",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Text(
                text = "\t\tInfo",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            )


        }

    }
}

@Preview(showBackground = true)
@Composable
fun OrderInfoCardPreview() {
    MyApp {
        OrderInfoCard()
    }
}