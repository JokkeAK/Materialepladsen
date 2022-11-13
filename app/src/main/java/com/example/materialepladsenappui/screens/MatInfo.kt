package com.example.materialepladsenappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

//Can the weight be measured with decimals? If so change to double.
@Composable
fun MatInfo(
    name: String,
    weightPrice: String,
    matInfo: String,
    size: String,
    cubicweight: Double,
    matNr: Int,
    matGroup: String,
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
                .size(360.dp, 310.dp)
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
                    .size(360.dp, 60.dp)
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


                }

            }
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .size(0.dp, 120.dp)){
            Column(modifier = Modifier
                .align(Alignment.TopStart)
                .padding(horizontal = 5.dp)){
                Text(text = stringResource(R.string.matsize),
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    ))
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = stringResource(R.string.cubicweight),
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    ))
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = stringResource(R.string.matnr),
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    ))
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = stringResource(R.string.matgroup),
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    ))
                Spacer(modifier = Modifier.height(5.dp))
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
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(
                        text = stringResource(R.string.mm),
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Row {
                    Text(
                        text = "$cubicweight",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(
                        text = stringResource(R.string.kg),
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Row {
                    Text(
                        text = "$matNr ",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Row {
                    Text(
                        text = "$matGroup ",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }

        }
        DividerBred()
        Spacer(modifier = Modifier.height(5.dp))
        Box(modifier = Modifier
            .fillMaxWidth()
            .size(0.dp, 270.dp)) {
            Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(horizontal = 10.dp)) {
                Text(text = "Produktbeskrivelse",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold)
                )
                LazyColumn(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()) {
                    
                    item { Text(text = matInfo,
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 18.sp,
                    )
                    ) }
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))
        BordeauxButton(text = "Vej bil", route = "OrderPage",navController )

    }
}


//Hard coded inputs for now. Need to receive this from somewhere.
@Preview(showBackground = true)
@Composable
fun MatInfoPreview() {
    MatInfo(
        "Granit grå 11-16 mm ",
        "DKK 0.8/kg",
        "Flisegrus bruges som afretningslag og klaplag (det øverste lag under belægningen). Størrelsen 0-8 mm gør det nemt for afretningen. Det høje lerindhold bevirker at gruset får en høj bæreevne. Det anbefales dog, at der kun bliver brugt et minimum af grus ca. 3-5 cm. Under gruset bør der lægges et lag stabilgrus, alt efter hvor højt fliserne skal ligge. Gruset sætter sig ca. 20% efter komprimering med pladevibrator. Flisegrus bruges som afretningslag og klaplag (det øverste lag under belægningen). Størrelsen 0-8 mm gør det nemt for afretningen. Det høje lerindhold bevirker at gruset får en høj bæreevne. Det anbefales dog, at der kun bliver brugt et minimum af grus ca. 3-5 cm. Under gruset bør der lægges et lag stabilgrus, alt efter hvor højt fliserne skal ligge. Gruset sætter sig ca. 20% efter komprimering med pladevibrator. ",
        "0-8",
        1.600,
        104,
        "Grus & Sand"
    )
}
