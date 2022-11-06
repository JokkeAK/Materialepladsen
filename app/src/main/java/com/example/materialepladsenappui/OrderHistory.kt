package com.example.materialepladsenappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialepladsenappui.ui.theme.BRed
import innerShadow

@Composable
fun OrderHis(){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Header()

        Text(
            stringResource(R.string.receipts),
            style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold))

        LazyColumn(modifier = Modifier
            .background(color = Color.Gray, shape = RectangleShape)
            .fillMaxWidth()
            .height(575.dp)
            //Custom inner shadow code from https://stackoverflow.com/questions/71054138/jetpack-compose-inner-shadow
            //Modified to fit our app design
            //Inbuilt shadows for backgrounds suck.
            .innerShadow(),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally){

            item { ReceiptCard(
                "07. november",
                "Næstved",
                4,
                2825,
                4034.5,
                onClick = {} ) //need to handle on click in the future
            Spacer(modifier = Modifier.height(5.dp))}
            items(20){index -> ReceiptCard(
                "07. november",
                "Næstved",
                4,
                2825,
                4034.5,
                onClick = {} ) //need to handle on click in the future

                Spacer(modifier = Modifier.height(5.dp))}
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Orderpreview() {
    MyApp {
        OrderHis()
    }
}