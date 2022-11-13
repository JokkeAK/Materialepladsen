@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.materialepladsenappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.materialepladsenappui.theme.BRed


@Composable
public fun Login(navController: NavHostController? = null){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Spacer(
            modifier = Modifier
                .height(height = 68.dp))
        Image(
            painter = painterResource(id = R.drawable.mp_logo_big),
            contentDescription = "Materialepladsen logo",
            modifier = Modifier
                .size(size = 275.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Fit)

        Spacer(
            modifier = Modifier
                .height(height = 10.dp))

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(width = 250.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = BRed,
                contentColor = Color.White
            ), shape = RectangleShape
        ){
            Text(text = stringResource(R.string.new_user),color = Color.White)
        }

        Spacer( modifier = Modifier.height(height = 200.dp))

        UsernameTextFiled()
        Spacer( modifier = Modifier.height(height = 10.dp))
        PasswordTextFiled()
        Spacer( modifier = Modifier.height(height = 20.dp))

        Button(onClick = { /*TODO*/ },
        modifier = Modifier.width(width = 250.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = BRed,
            contentColor = Color.White
        ), shape = RectangleShape
        ){
        Text(text = stringResource(R.string.login),color = Color.White)
    }
    }
}

@Composable
fun UsernameTextFiled(){

    //Need to make the value "Ny bruger" not hard coded, but how?
    var text by rememberSaveable { mutableStateOf("Ny bruger") }
    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = text,
        onValueChange = { text = it },
        label = { Text(stringResource(R.string.username)) },
        singleLine = true
    )
}

@Composable
fun PasswordTextFiled(){

    //Need to make the value "Password" not hard coded, but how?
    var text by rememberSaveable { mutableStateOf("Password") }
    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = text,
        onValueChange = { text = it },
        label = {Text(stringResource(R.string.password)) },
        singleLine = true
    )
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
        Login()
}