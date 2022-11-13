package com.example.materialepladsenappui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
public fun StartingWeight(weight: Int, navController: NavHostController? = null){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Header()





        Box() {
            Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {



            Spacer(modifier = Modifier.height(height = 200.dp))

            BordeauxButton(stringResource(R.string.start_weight), "", navController)

            Spacer(modifier = Modifier.height(height = 40.dp))

            Text(
                stringResource(R.string.start_weight) + " " + weight + " " + stringResource(R.string.kg),
                Modifier
                    .background(Color.Gray, RectangleShape)
                    .width(250.dp)
                    .height(height = 48.dp)
                    .wrapContentHeight(),
                Color.Black, fontSize = 20.sp, fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center)

            Spacer(modifier = Modifier.height(height = 40.dp))


            BordeauxButton(stringResource(R.string.continue_on), "buy on site", navController)

            }
        }



    }
}

@Preview(showBackground = true)
@Composable
fun StartingWeightTest() {
        StartingWeight(250)
}