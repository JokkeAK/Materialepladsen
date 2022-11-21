package com.example.materialepladsenappui

import DividerBred
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

//This composable is the "more info" page where the user can go into their account settings etc.
//Many of these buttons do not currently lead to anywhere yet.
@Composable
public fun MorePage(navController: NavHostController? = null) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Header()
        Spacer(modifier = Modifier.height(75.dp))
        DividerBred()
        MoreButtons(text = stringResource(R.string.more_personInf), navController)
        DividerBred()
        MoreButtons(text = stringResource(R.string.more_payment), navController)
        DividerBred()
        MoreButtons(text = stringResource(R.string.more_loader), navController, "Loader")
        DividerBred()
        MoreButtons(text = stringResource(R.string.more_corporate), navController)
        DividerBred()
        MoreButtons(text = stringResource(R.string.more_terms), navController)
        DividerBred()
        MoreButtons(text = stringResource(R.string.more_usage), navController)
        DividerBred()
        MoreButtons(text = stringResource(R.string.more_car), navController)
        DividerBred()
        MoreButtons(text = stringResource(R.string.more_contact), navController)
        DividerBred()
        MoreButtons(text = stringResource(R.string.more_password), navController)
        DividerBred()
        MoreButtons(text = stringResource(R.string.more_logOut), navController)
        DividerBred()

    }


}

//Default route is "home" for the buttons on the "more page" to prevent program from crashing.
@Composable
public fun MoreButtons(
    text: String = "notext",
    navController: NavHostController? = null,
    route: String = "home",
) {
    Column(modifier = Modifier.fillMaxWidth()) {


        Button(
            onClick = { navController?.navigate(route) }, modifier = Modifier
                .width(width = 450.dp)
                .height(height = 55.dp),

            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            )
        )
        {
            Box(
                modifier = Modifier.width(width = 400.dp),
                Alignment.CenterStart
            ) {
                Text(

                    text = text,
                    color = Color.Black,

                    style = TextStyle(
                        fontSize = 20.sp
                    )
                )
            }
        }
    }
}


@Preview
@Composable
fun Moreprev() {
    MorePage()

}