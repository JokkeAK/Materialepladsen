package com.example.materialepladsenappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

//Can the weight be measured with decimals? If so change to double.
@Composable
fun OrderPage(
    name: String,
    weightPrice: String,
    matInfo: String,
    inWeight: Int,
    outWeight: Int,
    payWeight: Int,
    totalPrice: Double,
    navController: NavHostController? = null
) {


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .size(360.dp, 360.dp)
        ) {

            //Image based on the material to be purchased. Need to fetch this from somewhere.
            Image(
                painter = painterResource(id = R.drawable.order_placeholder),
                contentDescription = "Image of material to be purchased",
                modifier = Modifier
                    .matchParentSize(),
                alignment = Alignment.TopCenter
            )

            //Box containing the header for the frame.
            Box(
                modifier = Modifier
                    .align(Alignment.TopCenter)
            ) {
                Header()
            }


            //Box containing the info about the material.
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(360.dp, 105.dp)
                    .clip(RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
                    .background(Color.White)
                    .align(Alignment.BottomCenter)
            ) {

                Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(10.dp)) {

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "$name- $weightPrice",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = matInfo,
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 16.sp
                        )
                    )

                }

            }
        }


        //Red divider line.
        DividerBred()

        Spacer(modifier = Modifier.height(5.dp))

        //Box containing the initial weight, weight after materials have been loaded and the material weight to be purchased.
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .size(0.dp, 70.dp),
        ) {

            Column(modifier = Modifier.align(Alignment.TopStart)) {
                Text(
                    text = "\t\t" + stringResource(R.string.in_weight),
                    style = TextStyle(fontSize = 17.sp)
                )

                Text(
                    text = "\t\t" + stringResource(R.string.out_weight),
                    style = TextStyle(fontSize = 17.sp)
                )

                Text(
                    text = "\t\t" + stringResource(R.string.pay_weight),
                    style = TextStyle(fontSize = 18.sp),
                    fontWeight = FontWeight.SemiBold
                )
            }


            Column(
                modifier = Modifier.align(Alignment.TopEnd),
                horizontalAlignment = Alignment.End
            ) {

                Row {
                    Text(
                        text = "$inWeight ",
                        style = TextStyle(fontSize = 17.sp)
                    )
                    Text(
                        text = stringResource(R.string.kg) + "\t\t\t",
                        style = TextStyle(fontSize = 17.sp)
                    )
                }

                Row {
                    Text(
                        text = "$outWeight ",
                        style = TextStyle(fontSize = 17.sp)
                    )
                    Text(
                        text = stringResource(R.string.kg) + "\t\t\t",
                        style = TextStyle(fontSize = 17.sp)
                    )
                }
                Row {
                    Text(
                        text = "$payWeight ",
                        style = TextStyle(fontSize = 17.sp)
                    )
                    Text(
                        text = stringResource(R.string.kg) + "\t\t\t",
                        style = TextStyle(fontSize = 17.sp)
                    )
                }
            }


        }

        DividerBred()

        //Box containing the total price.
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .size(0.dp, 30.dp),
        ) {
            Text(
                text = "\t\t" + stringResource(R.string.total),
                modifier = Modifier.align(Alignment.TopStart),
                style = TextStyle(fontSize = 24.sp),
                fontWeight = FontWeight.SemiBold

            )

            Text(
                text = stringResource(R.string.kr) + " " + totalPrice + "\t\t\t",
                modifier = Modifier.align(Alignment.TopEnd),
                style = TextStyle(fontSize = 24.sp),
                fontWeight = FontWeight.SemiBold
            )
        }

        DividerBred()

        Spacer(
            modifier = Modifier
                .height(height = 20.dp)
        )

        //The buttons to continue the flow.
        BordeauxButton(text = stringResource(R.string.order_more),"buy on site", navController)

        Spacer(
            modifier = Modifier
                .height(height = 20.dp)
        )

        BordeauxButton(text = stringResource(R.string.pay), "payment", navController)

    }

}


//Hard coded inputs for now. Need to receive this from somewhere.
@Preview(showBackground = true)
@Composable
fun OrderPagePreview() {
    OrderPage(
        "Granit grå 11-16 mm ",
        "DKK 0.8/kg",
        "Granit i grå med lille rød nist. Velegnet til indkørsler. Pynt i haver.",
        585,
        2825,
        2825 - 585,
        1792.0
    )
}
