package com.example.materialepladsenappui.screens

import android.icu.util.TimeUnit.values
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
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
import androidx.compose.ui.res.stringResource
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.hapticfeedback.HapticFeedbackType.Companion.values
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle.Companion.values
import androidx.compose.ui.text.style.TextAlign.Companion.values
import com.example.materialepladsenappui.BordeauxButton
import com.example.materialepladsenappui.Header
import java.time.chrono.JapaneseEra.values


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyScreenContent()
        }
    }
}


@Composable
fun MyApp(content: @Composable () -> Unit) {
    MaterialepladsenAppUITheme {
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
            contentDescription = "Materialepladsen logo",
            modifier = Modifier
                .size(size = 200.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Fit
        )

        Spacer(
            modifier = Modifier
                .height(height = 24.dp)
        )


        BordeauxButton(text = stringResource(com.example.materialepladsenappui.R.string.home_page_buy1))
        Spacer(
            modifier = Modifier
                .height(height = 24.dp)
        )

        BordeauxButton(text = stringResource(com.example.materialepladsenappui.R.string.home_page_buy2))
        Spacer(
            modifier = Modifier
                .height(height = 24.dp)
        )

        BordeauxButton(text = stringResource(com.example.materialepladsenappui.R.string.home_page_calc))
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
    MyApp {
        MyScreenContent()
    }
}