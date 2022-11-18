package com.example.materialepladsenappui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
//import com.example.materialepladsenappui.screens.MyApp
import com.example.materialepladsenappui.theme.BRed
import innerShadow


// All text is hardcoded. Needs to be changed.
@Composable
fun Receipt(date: String, totalPriceForDay: Double, navController: NavHostController? = null){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Header()

        Text(
            stringResource(R.string.receipts) + " " + date,
            style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(5.dp)
        )

        LazyColumn(modifier = Modifier
            .background(color = Color.Gray, shape = RectangleShape)
            .fillMaxWidth()
            .height(360.dp)
            //Custom inner shadow code from https://stackoverflow.com/questions/71054138/jetpack-compose-inner-shadow
            //Modified to fit our app design
            //Inbuilt shadows for backgrounds suck.
            .innerShadow(),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally){

            item { MaterialInfoCard("Flisegrus 0-8 mm", 200, 68.0)
                Spacer(modifier = Modifier.height(5.dp))}
            items(20){index -> MaterialInfoCard("Flisegrus 0-8 mm", 200, 68.0)
                Spacer(modifier = Modifier.height(5.dp))}
        }

        Divider()

        Box(modifier = Modifier
            .fillMaxWidth()) {
            Text(
                text = "\t\t\t" + stringResource(R.string.total),
                modifier = Modifier.align(Alignment.TopStart),
                style = TextStyle(fontSize = 20.sp)
            )
            Text(
                text = "" + totalPriceForDay + " " + stringResource(R.string.kr) + "\t\t\t",
                modifier = Modifier.align(Alignment.TopEnd),
                style = TextStyle(fontSize = 20.sp)
            )
        }

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(height = 32.dp))

        BordeauxButton(stringResource(R.string.export), navController)

    }

}

@Composable
fun Divider(){

    Spacer(modifier = Modifier
        .height(height = 3.dp))

    Divider(
        color = BRed,
        modifier = Modifier
            .fillMaxWidth(0.95F)
            .height(2.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ReceiptPreview() {
        Receipt("07/11-2022",
        4034.50)
}
