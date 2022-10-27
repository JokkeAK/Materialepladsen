package com.example.materialepladsenappui

import androidx.activity.ComponentActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialepladsenappui.ui.theme.BRed

@Composable
public fun MorePage(){
    Column(modifier = Modifier.fillMaxSize().background(Color.White),
           verticalArrangement = Arrangement.Top,
           horizontalAlignment = Alignment.CenterHorizontally)
    {
            Header()
            Spacer(modifier = Modifier.height(75.dp))
        DividerBred()
        MoreButtons("Personlige oplysninger")
        DividerBred()
        MoreButtons("Betalingløsninger")
        DividerBred()
        MoreButtons("Læssekort")
        DividerBred()
        MoreButtons("Tilknyt virksomhed")
        DividerBred()
        MoreButtons("Betingelser")
        DividerBred()
        MoreButtons("Beregn forbrug")
        DividerBred()
        MoreButtons("Bil-administration")
        DividerBred()
        MoreButtons("Kontakt")
        DividerBred()
        MoreButtons("Ændre kodeord")
        DividerBred()
        MoreButtons("Log ud")
        DividerBred()

    }


}

@Composable
public fun MoreButtons(text: String = "notext"){
    Column(modifier = Modifier.fillMaxWidth()) {


    Button(onClick = { /*TODO*/ }, modifier = Modifier
        .width(width = 450.dp)
        .height(height = 55.dp),

        shape = RectangleShape,
           colors = ButtonDefaults.buttonColors(
               containerColor = Color.White,
               contentColor = Color.Black))
    {
       Box(modifier = Modifier.width(width = 400.dp),
        Alignment.CenterStart){ Text(

            text = text,
            color = Color.Black,

            style = TextStyle(
                fontSize = 20.sp)
        )}
    } }
}
@Composable
fun DividerBred(){
    Spacer(modifier = Modifier
        .fillMaxWidth()
        .height(height = 5.dp))
    Divider(
        color = BRed,
        modifier = Modifier
            .fillMaxWidth()
            .width(1.dp)
    )

}

@Preview
@Composable
fun Moreprev() {
    MorePage()

}