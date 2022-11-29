package com.example.materialepladsenappui


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.materialepladsenappui.theme.BRed

//This composable shows the materials that can be purchased at the user's location.
@Composable
fun BuyOnSite(navController: NavHostController? = null) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = CenterHorizontally
    ) {


        Header()

        Spacer(modifier = Modifier.height(19.dp))

        MaterialList(navController)

    }
}

//This composable shows the materials that can be purchased at the customer location in a horizontal and vertical list.
@Composable
fun MaterialList(navController: NavHostController? = null) {
    LazyColumn(
        modifier = Modifier
            .background(color = Color.Gray, shape = RectangleShape)
            .fillMaxWidth()
            .height(500.dp),
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 10.dp)
    ) {


        item { BoldText(str = "Granit") }
        items(1) { index ->
            RowInGrid(i = 5,navController)
        }
        item { BoldText(str = "Grus") }
        items(1) { index ->
            RowInGrid(i = 5,navController)
        }
        item { BoldText(str = "Andet") }
        items(1) { index ->
            RowInGrid(i = 5,navController)
        }
        item { BoldText(str = "Andet") }
        items(1) { index ->
            RowInGrid(i = 5,navController)
        }
    }
}


@Composable
fun RowInGrid(i: Int,navController: NavHostController? = null) {

    LazyRow() {
        items(i) { index ->
            BuyCard(navController,"mat info")
        }
    }
    Spacer(modifier = Modifier.height(30.dp))
}

@Composable
fun BoldText(str: String) {
    Text(text = str, fontSize = 20.sp, fontWeight = FontWeight.Bold)
}

//This composable is the card for each product.
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BuyCard(navController: NavHostController? = null,
            route: String = "home"){


    Card(onClick = {navController?.navigate(route) },
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(top = 6.dp, bottom = 6.dp, start = 15.dp, end = 15.dp)
            .fillMaxWidth(0.9F),
        elevation = CardDefaults.cardElevation(8.dp),

    ) {

        Column(horizontalAlignment = CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.mp_logo_big),
                contentDescription = "Materialepladsen logo",
                modifier = Modifier
                    .size(size = 85.dp)
                    .clip(shape = RectangleShape),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text("Navn")
            Spacer(modifier = Modifier.height(3.dp))
            Text("Kgpris")

        }

    }
}

@Preview(showBackground = true)
@Composable
fun MaterialPreview() {
    BuyOnSite()
}