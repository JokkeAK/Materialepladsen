package com.example.materialepladsenappui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialepladsenappui.ui.theme.BRed


@Composable
public fun Weight() {
    Header()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.height(85.dp))
        Box(
            modifier = Modifier

                .width(250.dp)
                .height(60.dp)
                .align(Alignment.CenterHorizontally)
                .background(Color.Gray)
        )

        {

            Text(
                text = "Vægtoversigt",
                modifier = Modifier.align(Alignment.Center),
                style = TextStyle(fontSize = 25.sp)

            )
        }
        Spacer(modifier = Modifier.height(7.dp))

        LazyColumn(modifier = Modifier
            .background(color = Color.Gray, shape = RectangleShape)
            .fillMaxWidth()
            .height(400.dp),
            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally){

            item { BordeauxButton(text = "tester")
                Spacer(modifier = Modifier.height(10.dp))}
            items(10){index -> BordeauxButton(text = "tester $index")
                Spacer(modifier = Modifier.height(10.dp))}
        }
        Spacer(modifier = Modifier.height(7.dp))

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(width = 250.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = BRed,
                contentColor = Color.White
            ), shape = RectangleShape
        ){
            Text(text = "Ny bruger?",color = Color.White)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun WeightPreview() {
    Weight()
}
