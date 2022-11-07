package com.example.materialepladsenappui

import android.graphics.Paint
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.SemanticsProperties.ContentDescription
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.materialepladsenappui.ui.theme.*

//Can the weight be measured with decimals? If so change to double.
@Composable
fun OrderPage(name: String, weightPrice: String, matInfo: String, matTotalWeight: Int, matTotalPrice: Double) {


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(modifier = Modifier
            .fillMaxWidth()
            .size(360.dp, 360.dp)){

            //Image to be used when going to the order page. Either the same static image or based on the material to be purchased.
            Image(
                painter = painterResource(id = R.drawable.order_background),
                contentDescription = "Order background",
                modifier = Modifier
                    .matchParentSize(),
                alignment = Alignment.TopCenter)

            //Header for the frame.
            Header()

            //Box containing the info about the material.
            Box(modifier = Modifier
                .fillMaxWidth()
                .size(360.dp, 170.dp)
                .clip(RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
                .background(Color.White)
                .align(Alignment.BottomCenter)){

                Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(10.dp)) {

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "$name - $weightPrice",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold))

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = matInfo,
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 16.sp))

                }

            }
        }


        //Red divider line.
        DividerBred()

        Spacer(modifier = Modifier.height(10.dp))

        //Box containing the total weight and price for the material to be purchased.
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .size(0.dp, 90.dp)
        ) {
            Text(
                text = "\t\t" + stringResource(R.string.total),
                modifier = Modifier.align(Alignment.TopStart),
                style = TextStyle(fontSize = 15.sp)
            )
            Text(
                text = "" +matTotalWeight + " " + stringResource(R.string.kg) + "\t\t\t",
                modifier = Modifier.align(Alignment.TopEnd),
                style = TextStyle(fontSize = 15.sp)
            )

            Text(
                text = "" + matTotalPrice + " " + stringResource(R.string.kr) + "\t\t\t",
                modifier = Modifier.align(Alignment.CenterEnd),
                style = TextStyle(fontSize = 15.sp)
            )



        }

        //The buttons to continue the flow.
        BordeauxButton(text = stringResource(R.string.order_more))

        Spacer(
            modifier = Modifier
                .height(height = 32.dp)
        )

        BordeauxButton(text = stringResource(R.string.pay))

    }

}


//Hard coded inputs for now. Need to receive this from somewhere.
@Preview(showBackground = true)
@Composable
public fun OrderPagePreview(){
    OrderPage(
        "Granit grå 11-16 mm ",
        "0,8 kr./kg",
        "Granit i grå med lille rød nist. Velegnet til indkørsler. Pynt i haver.",
        1367,
        1093.6)
}
