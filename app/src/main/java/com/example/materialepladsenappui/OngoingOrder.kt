package com.example.materialepladsenappui

import android.graphics.Paint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.materialepladsenappui.ui.theme.*


@Composable
fun OrderPage(){

    Header()
   Column(modifier = Modifier.fillMaxWidth()) {

       Spacer(modifier = Modifier.height(85.dp))
       Box(modifier = Modifier

           .width(250.dp)
           .height(60.dp)
           .align(Alignment.CenterHorizontally)
           .background(Gray))

       {

           Text(text = "Ordreoversigt",
               modifier = Modifier.align(Alignment.Center),
            style= TextStyle(fontSize = 25.sp)

           )
       }
       Spacer(modifier = Modifier.height(7.dp))

       LazyColumn(modifier = Modifier
           .background(color = Gray, shape = RectangleShape)
           .fillMaxWidth()
           .height(400.dp),
           contentPadding = PaddingValues(horizontal = 10.dp, vertical = 10.dp),
           horizontalAlignment = Alignment.CenterHorizontally){

           item { BordeauxButton(text = "tester")
               Spacer(modifier = Modifier.height(10.dp))}
           items(10){index -> BordeauxButton(text = "tester $index")
               Spacer(modifier = Modifier.height(10.dp))}


       }
       /*
   Place for list of products
   */
       //Spacer(modifier = Modifier.height(350.dp))
       Column(modifier = Modifier.fillMaxSize()) {
           DividerBred()
           Spacer(modifier = Modifier.height(20.dp))
           
           Box(modifier = Modifier
               .fillMaxWidth()){
               Text(text = "\t \t Total",
                   style= TextStyle(fontSize = 25.sp))
               Text(text = "2000 kr. \t \t",
               modifier = Modifier.align(Alignment.BottomEnd),
                       style = TextStyle(fontSize = 25.sp))




           }
           Box(modifier = Modifier
               .fillMaxWidth()) {

               Text(
                   text = "2000 kg. \t \t",
                   modifier = Modifier.align(Alignment.BottomEnd),
                   style = TextStyle(fontSize = 25.sp)
               )
           }

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Spacer(modifier = Modifier.height(60.dp))
           BordeauxButton(text = "Betaling")}
       }
       




        
    }
}

@Preview(showBackground = true)
@Composable
public fun OrderPagePreview(){
    OrderPage()
}