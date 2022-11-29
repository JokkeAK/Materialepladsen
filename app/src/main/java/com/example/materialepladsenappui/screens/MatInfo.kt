package com.example.materialepladsenappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
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
import com.example.materialepladsenappui.theme.BRed




//Composable for additional info for the product to be purchased.
@Composable
fun MatInfo(
    navController: NavHostController? = null
) {


     Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            MaterialNameAndImage(
                "Granit grå 11-16 mm ",
                "DKK 0.8/kg",
                "0-8",
                1.600,
                104,
                "Grus & Sand"
            )

            Divider(
                color = BRed,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp))

            MaterialDescription(
                "Flisegrus bruges som afretningslag og klaplag (det øverste lag under belægningen). " +
                        "Størrelsen 0-8 mm gør det nemt for afretningen. Det høje lerindhold bevirker at gruset får en høj bæreevne. " +
                        "Det anbefales dog, at der kun bliver brugt et minimum af grus ca. 3-5 cm. Under gruset bør der lægges et lag " +
                        "stabilgrus, alt efter hvor højt fliserne skal ligge. Gruset sætter sig ca. 20% efter komprimering med pladevibrator."
            )

            Spacer(modifier = Modifier.height(15.dp))

            BordeauxButton(text = stringResource(R.string.continue_on), navController, "order page")

     }
}

//This composable holds the image, name with price/kg for the chosen material and descriptors of the chosen material
@Composable
fun MaterialNameAndImage(
    name: String,
    weightPrice: String,
    size: String,
    cubicweight: Double,
    matNr: Int,
    matGroup: String,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .size(0.dp, 340.dp),
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
                .size(0.dp, 135.dp)
                .clip(RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
                .background(Color.White)
                .align(Alignment.BottomCenter)
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(5.dp)
            ) {

                Text(
                    text = "$name- $weightPrice",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                )

                //Spacer(modifier = Modifier.height(5.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(0.dp, 100.dp)
                ) {

                    Column(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(horizontal = 10.dp)
                    ) {

                        Text(
                            text = stringResource(R.string.matsize),
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )

                       // Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = stringResource(R.string.cubicweight),
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )

                       // Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = stringResource(R.string.matnr),
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )

                        //Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = stringResource(R.string.matgroup),
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                    Column(
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(horizontal = 5.dp),
                        horizontalAlignment = Alignment.End
                    ) {

                        Row {

                            Text(
                                text = "$size ",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )

                            Text(
                                text = stringResource(R.string.mm),
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                        }

                        //Spacer(modifier = Modifier.height(5.dp))

                        Row {
                            Text(
                                text = "$cubicweight ",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )

                            Text(
                                text = stringResource(R.string.kg),
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                        }

                        //Spacer(modifier = Modifier.height(5.dp))

                        Row {
                            Text(
                                text = "$matNr ",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                        }
                        //Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "$matGroup ",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}


//This composable holds the expanded material description.
@Composable
fun MaterialDescription(matDescription: String) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .size(0.dp, 180.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(horizontal = 10.dp)
        ) {
            Text(
                text = "Produktbeskrivelse",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {

                item {
                    Text(
                        text = matDescription,
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 16.sp,
                        )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MatInfoPreview() {
    MatInfo()
}
