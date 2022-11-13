package com.example.materialepladsenappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
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
import androidx.navigation.NavHostController

//import com.example.materialepladsenappui.screens.MyApp

// All text is hardcoded. Needs to be changed.

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReceiptCard(
    date: String,
    location: String,
    matTypeAmount: Int,
    totalWeightForDay: Int,
    totalPriceForDay: Double,
    navController: NavHostController? = null
) {

    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(top = 6.dp, bottom = 6.dp)
            .fillMaxWidth(0.9F),
        elevation = CardDefaults.cardElevation(8.dp),
        onClick = {navController?.navigate("receipt") }

    ) {



        Row(
            modifier = Modifier
            .background(color = Color.White)) {

            Column() {

                Text(
                    text = "\t$date-$location",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 18.sp,
                    )
                )


                Box(modifier = Modifier
                    .fillMaxWidth()) {
                    Text(
                        text = "\t" + matTypeAmount + " varer",
                        modifier = Modifier.align(Alignment.BottomStart),
                        style = TextStyle(fontSize = 13.sp)
                    )
                    Text(
                        text = "" + totalPriceForDay + " kr. \t\t",
                        modifier = Modifier.align(Alignment.BottomEnd),
                        style = TextStyle(fontSize = 20.sp)
                    )
                }

                Text(
                    text = "\t$totalWeightForDay kg",
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


//Info about the receipt is hard coded for now. Need to get the data from somewhere.
@Preview(showBackground = true)
@Composable
fun ReceiptCardPreview(navController: NavHostController? = null) {
        ReceiptCard(
            "07. november",
            "Næstved",
            4,
            2825,
            4034.5,
            )
}

