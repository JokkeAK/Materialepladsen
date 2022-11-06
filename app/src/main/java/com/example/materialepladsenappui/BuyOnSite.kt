package com.example.materialepladsenappui


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.materialepladsenappui.ui.theme.*
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun BuyOnSite(){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = CenterHorizontally
    ) {


        Header()

        Spacer(modifier = Modifier.height(19.dp))



        LazyColumn(modifier = Modifier
            .background(color = Color.Gray, shape = RectangleShape)
            .fillMaxWidth()
            .height(526.dp),
            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 10.dp),
            /*horizontalAlignment = CenterHorizontally*/){


            item { BoldText(str = "Granit")}
            items(1){
                index -> RowInGrid(i = 5)
            }
            item { BoldText(str = "Grus")}
            items(1){
                    index -> RowInGrid(i = 5)
            }
            item { BoldText(str = "Andet")}
            items(1){
                    index -> RowInGrid(i = 5)
            }
            item { BoldText(str = "Andet")}
            items(1){
                    index -> RowInGrid(i = 5)
            }

        }

        /*
        LazyColumn(modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Gray, shape = RectangleShape)
            .height(500.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 10.dp)
            ) {





            
            LazyRow{
                item { BordeauxButton(text = "test1") }
                items(10){
                    index -> BordeauxButton(text = "test $index")
                }
            }
            Spacer(modifier = Modifier.height(70.dp))

            LazyRow{
                item { BordeauxButton(text = "test1") }
                items(10){
                        index -> BordeauxButton(text = "test $index")
                }
            }
            Spacer(modifier = Modifier.height(70.dp))

            LazyRow{
                item { BordeauxButton(text = "test1") }
                items(10){
                        index -> BordeauxButton(text = "test $index")
                }
                
            }
            Spacer(modifier = Modifier.height(70.dp))
            LazyRow{
                item { BordeauxButton(text = "test1") }
                items(10){
                        index -> BordeauxButton(text = "test $index")
                }
            }
            Spacer(modifier = Modifier.height(70.dp))

            LazyRow{
                item { BordeauxButton(text = "test1") }
                items(10){
                        index -> BordeauxButton(text = "test $index")
                }
            }
            Spacer(modifier = Modifier.height(70.dp))


        }

    */

        Spacer(Modifier.height(3.dp))
        Divider(
            color = BRed,
            modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
        )

        Spacer(modifier = Modifier.height(50.dp))

        BordeauxButton(text = "Vej bil")
    }
}


@Composable
fun RowInGrid(i : Int){

    LazyRow(){
        items(i){
            index -> BuyCard(onClick = {})
        }
    }
    Spacer(modifier = Modifier.height(30.dp))
}
@Composable
fun BoldText(str: String){
        Text(text = str, fontSize = 20.sp, fontWeight = FontWeight.Bold)
}

@Composable
fun BuyCard(onClick: () -> Unit/*Needs input*/){
    Card(shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(top = 6.dp, bottom = 6.dp, start = 15.dp, end = 15.dp)
            .fillMaxWidth(0.9F),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {

        Column(horizontalAlignment = CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.mp_logo_big),
                contentDescription = "materialepladsen logo",
                modifier = Modifier
                    .size(size = 85.dp)
                    .clip(shape = RectangleShape),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text("Navn")
            Spacer(modifier = Modifier.height(3.dp))
            Text("Kgpris")

        }

    }
}
@Preview(showBackground = true)
@Composable
fun MaterialPreview() {
    BuyOnSite()
}