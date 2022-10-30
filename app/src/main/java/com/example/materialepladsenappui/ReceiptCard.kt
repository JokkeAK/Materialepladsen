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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// All text is hardcoded. Needs to be changed.

@Composable
fun ReceiptCard(onClick: () -> Unit) { //need to handle on click in the future

    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(top = 6.dp, bottom = 6.dp)
            .fillMaxWidth(0.9F),
        elevation = CardDefaults.cardElevation(8.dp),

    ) {



        Row(
            modifier = Modifier
            .background(color = Color.White)) {

            Column() {

                Text(
                    text = "\t07. November - Næstved",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 18.sp,
                    )
                )


                Box(modifier = Modifier
                    .fillMaxWidth()) {
                    Text(
                        text = "\t4 varer",
                        modifier = Modifier.align(Alignment.BottomStart),
                        style = TextStyle(fontSize = 13.sp)
                    )
                    Text(
                        text = "4.034,5 kr. \t\t",
                        modifier = Modifier.align(Alignment.BottomEnd),
                        style = TextStyle(fontSize = 20.sp)
                    )
                }

                Text(
                    text = "\t2.825 kg",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 13.sp,
                    )
                )

                Spacer(
                    modifier = Modifier
                        .height(height = 5.dp))

            }


        }
    }
}



@Preview(showBackground = true)
@Composable
fun ReceiptCardPreview() {
    MyApp {
        ReceiptCard(onClick = {} ) //need to handle on click in the future
    }
}

