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
public fun SignUp(navController: NavHostController? = null){
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
                .size(size = 100.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Fit)

        Spacer(modifier = Modifier.height(height = 10.dp))
        UsernameTextFiled()
        Spacer( modifier = Modifier.height(height = 10.dp))
        EmailTextFiled()
        Spacer( modifier = Modifier.height(height = 10.dp))
        TlfTextFiled()
        Spacer( modifier = Modifier.height(height = 10.dp))
        CityTextFiled()
        Spacer( modifier = Modifier.height(height = 10.dp))
        PasswordTextFiled()
        Spacer( modifier = Modifier.height(height = 10.dp))
        ZipTextFiled()
        Spacer( modifier = Modifier.height(height = 10.dp))
        LicensePlateTextFiled()
        Spacer( modifier = Modifier.height(height = 60.dp))
        PasswordTextFiled()


        Spacer( modifier = Modifier.height(height = 20.dp))


        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(width = 250.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = BRed,
                contentColor = Color.White
            ), shape = RectangleShape
        ){
            Text(stringResource(R.string.login),color = Color.White)
        }
    }
}


//Need to make the values in mutableStateOf not hard coded, but how?

@Composable
private fun FullNameTextFiled(){

    var text by rememberSaveable { mutableStateOf("Navn") }
    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = text,
        onValueChange = { text = it },
        label = { Text(stringResource(R.string.name_full)) },
        singleLine = true
    )
}

@Composable
private fun EmailTextFiled(){

    var text by rememberSaveable { mutableStateOf("Email@Email.dk") }
    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = text,
        onValueChange = { text = it },
        label = { Text(stringResource(R.string.mail)) },
        singleLine = true
    )
}

@Composable
private fun TlfTextFiled(){

    var text by rememberSaveable { mutableStateOf("+45 12 34 56 78") }
    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = text,
        onValueChange = { text = it },
        label = { Text(stringResource(R.string.phone)) },
        singleLine = true
    )
}

@Composable
private fun CityTextFiled(){

    var text by rememberSaveable { mutableStateOf("Roskilde") }
    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = text,
        onValueChange = { text = it },
        label = { Text(stringResource(R.string.city)) },
        singleLine = true
    )
}
@Composable
private fun ZipTextFiled(){

    var text by rememberSaveable { mutableStateOf("4000") }
    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = text,
        onValueChange = { text = it },
        label = { Text(stringResource(R.string.zip)) },
        singleLine = true
    )
}

@Composable
private fun LicensePlateTextFiled(){

    var text by rememberSaveable { mutableStateOf("AA 12 345") }
    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = text,
        onValueChange = { text = it },
        label = { Text(stringResource(R.string.license)) },
        singleLine = true
    )
}

@Preview(showBackground = true)
@Composable
fun SignUpPreview() {
    SignUp()
}