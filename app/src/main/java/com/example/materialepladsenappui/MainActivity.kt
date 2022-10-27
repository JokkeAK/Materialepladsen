package com.example.materialepladsenappui

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialepladsenappui.ui.theme.MaterialepladsenAppUITheme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.layout.ContentScale


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyScreenContent()
            }
        }
    }


@Composable
fun MyApp(content: @Composable () -> Unit ) {
    MaterialepladsenAppUITheme() {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            content()
        }
    }
}

@Composable
fun MyScreenContent() {

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
        ){

        Image(
            painter = painterResource(id = com.example.materialepladsenappui.R.drawable.mp_logo_text),
            contentDescription = "materialepladsen logo",
            modifier = Modifier
                .width(194.dp)
                .height(56.dp),
            alignment = Alignment.Center)

        Greeting(name = "bruh")

        Spacer(
            modifier = Modifier
                .height(height = 30.dp))

        Image(
            painter = painterResource(id = com.example.materialepladsenappui.R.drawable.mp_logo_big),
            contentDescription = "materialepladsen logo",
            modifier = Modifier
                .size(size = 275.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Fit)

        Spacer(
            modifier = Modifier
                .height(height = 68.dp))


        KøbPåPladsKnap()
        KøbOnlineKnap()
        UdregnForbrugKnap()
    }

}

@Composable
fun Greeting(name: String) {

    Divider(
        color = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .width(1.dp)
    )
    Text(text = "Velkommen, $name",
        color = Color.Black,
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontSize = 28.sp),
        modifier = Modifier
            .padding(all = 16.dp))

    Divider(
        color = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .width(1.dp)
    )
}



@Composable
fun KøbPåPladsKnap() {
    Button(onClick = { /*TODO*/ },
        modifier = Modifier.width(width = 250.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF890C18),
            contentColor = Color.White
        )
    ){
        Text(
            text = "Køb på plads",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp)
        )    }
    Spacer(
        modifier = Modifier
            .height(height = 51.dp))
}

@Composable
fun KøbOnlineKnap() {
    Button(onClick = { /*TODO*/ },
        modifier = Modifier.width(width = 250.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF890C18),
            contentColor = Color.White
        )
    ){
        Text(
            text = "Køb online",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp)
        )
    }

    Spacer(
        modifier = Modifier
            .height(height = 51.dp))
}

@Composable
fun UdregnForbrugKnap() {
    Button(onClick = { /*TODO*/ },
        modifier = Modifier.width(width = 250.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF890C18),
            contentColor = Color.White
        )
    ){
        Text(
            text = "Udregn forbrug",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp)
        )
    }
    Spacer(
        modifier = Modifier
            .height(height = 51.dp))

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp {
        MyScreenContent()
    }
}