package com.example.materialepladsenappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialepladsenappui.theme.MaterialepladsenAppUITheme
import androidx.compose.ui.res.stringResource
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.layout.ContentScale
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun HomePage(navController: NavHostController? = null) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Header()

        Greeting(name = "bruh") //harcoded name, needs to be changed

        Spacer(
            modifier = Modifier
                .height(height = 30.dp)
        )

        Image(
            painter = painterResource(id = com.example.materialepladsenappui.R.drawable.mp_logo_big),
            contentDescription = "materialepladsen logo",
            modifier = Modifier
                .size(size = 200.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Fit
        )

        Spacer(
            modifier = Modifier
                .height(height = 24.dp)
        )


        BordeauxButton(text = stringResource(com.example.materialepladsenappui.R.string.home_page_buy1), "starting weight", navController)

        Spacer(
            modifier = Modifier
                .height(height = 24.dp)
        )

        BordeauxButton(text = stringResource(com.example.materialepladsenappui.R.string.home_page_buy2),"", navController)
        Spacer(
            modifier = Modifier
                .height(height = 24.dp)
        )

        BordeauxButton(text = stringResource(com.example.materialepladsenappui.R.string.home_page_calc),"", navController)
    }

}





@Composable
fun Greeting(name: String) {

    Divider(
        color = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .height(3.dp)
    )
    Text(
        text = "Velkommen, $name",
        color = Color.Black,
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontSize = 28.sp
        ),
        modifier = Modifier
            .padding(all = 16.dp)
    )

    Divider(
        color = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .height(3.dp)
    )
}



@Preview(showBackground = true)
@Composable
fun HomePagePreview() {
        HomePage()

}