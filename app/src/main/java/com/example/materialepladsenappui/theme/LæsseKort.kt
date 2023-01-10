package com.example.materialepladsenappui


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialepladsenappui.ui.theme.Bred


@Composable
fun SignUp(){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Header()

        Spacer(modifier = Modifier.height(height = 50.dp))

        Text(text = "Scan QR-kode for at åbne porten",
            color = Color.Black,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .padding(all = 30.dp))

        Spacer( modifier = Modifier.height(height = 420.dp))


        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(width = 300.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = BRed,
                contentColor = Color.White
            ), shape = RectangleShape
        ){
            Text(text = "Intruktionsvideo",color = Color.White)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SignUpPreview() {
    SignUp()
}


