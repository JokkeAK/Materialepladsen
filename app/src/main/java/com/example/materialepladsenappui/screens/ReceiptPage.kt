package com.example.materialepladsenappui

//import com.example.materialepladsenappui.screens.MyApp
import DividerBred
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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

//This composable shows the receipt for an order.
// All text is hardcoded. Needs to be changed.
@Composable
fun Receipt(
    navController: NavHostController? = null
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        ReceiptDateAndInfo(
            "07. november",
            "Næstved",
            "Granit grå 11-16 mm ",
            "DKK 0.8/kg",
            "Granit i grå med lille rød nist. Velegnet til indkørsler. Pynt i haver.",
            navController
        )

        DividerBred()

        Spacer(modifier = Modifier.height(5.dp))

        WeightAtPurchase(
            585,
            2825,
            2825 - 585,
        )


        DividerBred()

        ReceiptPrice(1792.0)

        DividerBred()

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(height = 32.dp)
        )

        BordeauxButton(stringResource(R.string.export), navController){}
    }
}

//This composable shows the image of the purchased material, the date and location of purchase and
//the info about the material.
@Composable
fun ReceiptDateAndInfo(
    date: String,
    location: String,
    name: String,
    weightPrice: String,
    matInfo: String,
    navController: NavHostController? = null
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .size(360.dp, 320.dp)
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
                .size(360.dp, 135.dp)
                .clip(RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
                .background(Color.White)
                .align(Alignment.BottomCenter)
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(10.dp)
            ) {

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "\t$date - $location",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 26.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                )

                Text(
                    text = "$name- $weightPrice",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                )

                Spacer(modifier = Modifier.height(5.dp))

                Box(modifier = Modifier) {
                    Text(
                        text = matInfo,
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 16.sp
                        ),
                        modifier = Modifier.align(Alignment.TopStart)
                    )

                    //This text is clickable and leads to the home page for now instead of a more detailed product page.
                    Text(
                        text = stringResource(R.string.more_mat_info),
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .clickable(onClick = { navController?.navigate("mat info receipt") })

                    )
                }


            }

        }
    }
}


//This composable contains the initial weight, weight after materials have been loaded and the material weight that have been paid for.
@Composable
fun WeightAtPurchase(
    inWeight: Int,
    outWeight: Int,
    payWeight: Int,
) {
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
}

//This composable shows the price that was paid.
@Composable
fun ReceiptPrice(totalPrice: Double) {
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

}

@Preview(showBackground = true)
@Composable
fun ReceiptPreview() {
    Receipt()
}
