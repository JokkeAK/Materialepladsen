package com.example.materialepladsenappui

import android.media.Image
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//import com.example.materialepladsenappui.screens.MyApp

/*
The card to be shown in order history which shows an image of the purchased material,
the date and location and the amount and price.
All text is hardcoded. Needs to be changed.
 */
@Composable
fun MaterialInfoCard(
    date: String,
    location: String,
    matInfo: String,
    matTotalWeight: Int,
    matTotalPrice: Double) {

    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(top = 6.dp, bottom = 6.dp)
            .size(330.dp, 80.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {

        //Row with the image and text.
        Row(
            modifier = Modifier
                .background(color = Color.White)
        ) {

            Image(
                painter = painterResource(id = R.drawable.order_placeholder),
                contentDescription = "Material picture",
                modifier = Modifier
                    .size(size = 80.dp)
                    .clip(shape = RoundedCornerShape(topStart = 8.dp, bottomStart = 8.dp)),
                contentScale = ContentScale.Crop
            )


            //Column that holds the text.
                Column() {
                    Text(
                        text = "\t$date - $location",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )

                    Text(
                        text = "\t" + matInfo,
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 16.sp
                        )
                    )

                    Spacer(
                        modifier = Modifier
                            .height(height = 12.dp)
                    )

                    //Box to have the last line of the column fit properly.
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "\t" + matTotalWeight + " " + stringResource(R.string.kg),
                            style = TextStyle(fontSize = 14.sp),
                            modifier = Modifier.align(Alignment.BottomStart)
                        )
                        Text(
                            text = stringResource(R.string.kr) + " " + matTotalPrice + "\t\t\t",
                            modifier = Modifier.align(Alignment.BottomEnd),
                            style = TextStyle(fontSize = 14.sp)
                        )
                    }
                }
            }
        }
    }


//Info about the material is hard coded for now. Need to get the data from somewhere.
@Preview(showBackground = true)
@Composable
fun MaterialInfoCardPreview() {
        MaterialInfoCard(
            "07. november",
            "Næstved",
            "Flisegrus 0-8 mm",
            200,
            68.0)
}