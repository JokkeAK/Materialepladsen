package com.example.materialepladsenappui


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.materialepladsenappui.ui.theme.*

@Composable
fun BuyOnSite(){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Header()

        Spacer(modifier = Modifier.height(40.dp))

        BordeauxButton(text = "Vej bil")
        
        Spacer(modifier = Modifier.height(10.dp))

        LazyColumn(modifier = Modifier
            .background(color = Color.Gray, shape = RectangleShape)
            .fillMaxWidth()
            .height(400.dp),
            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally){


            items(6){
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


    }
}

@Preview(showBackground = true)
@Composable
fun MaterialPreview() {
        BuyOnSite()
}

@Composable
fun RowInGrid(i : Int){

    LazyRow(){
        items(i){
            index -> BordeauxButton(text = "test $index")
        }
    }
    Spacer(modifier = Modifier.height(50.dp))
}
