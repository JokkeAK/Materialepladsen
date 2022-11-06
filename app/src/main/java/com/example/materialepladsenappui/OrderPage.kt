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
import androidx.compose.ui.semantics.SemanticsProperties.ContentDescription
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.materialepladsenappui.ui.theme.*


@Composable
fun OrderPage() {


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

                Box(modifier = Modifier
                    .fillMaxWidth()
                    .size(360.dp, 360.dp)){

                    Image(
                        painter = painterResource(id = R.drawable.order_background),
                        contentDescription = "Order background",
                        modifier = Modifier
                            .matchParentSize(),
                        alignment = Alignment.TopCenter)

                    Header()


                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .size(360.dp, 170.dp)
                        .clip(RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
                        .background(Color.White)
                        .align(Alignment.BottomCenter)){

                        Text(
                            text = "\n\t\tFlisegrus 0-8 mm \t\t\t\t"  + "pris " + "kr./kg",
                            modifier = Modifier.align(Alignment.TopStart),
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold))

                        Text(
                            text = "\n\t\tInfo\n",
                            modifier = Modifier.align(Alignment.CenterStart),
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold))
                    }
                }



                    DividerBred()

                    Spacer(modifier = Modifier.height(10.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(0.dp, 90.dp)
                    ) {
                        Text(
                            text = "\t\t Total",
                            modifier = Modifier.align(Alignment.TopStart),
                            style = TextStyle(fontSize = 15.sp)
                        )
                        Text(
                            text = "Vægt " + "kg.\t\t",
                            modifier = Modifier.align(Alignment.TopEnd),
                            style = TextStyle(fontSize = 15.sp)
                        )

                        Text(
                            text = "Pris " + "kr.\t\t",
                            modifier = Modifier.align(Alignment.CenterEnd),
                            style = TextStyle(fontSize = 15.sp)
                        )



                }

        BordeauxButton(text = "Fortsæt med at handle")

        Spacer(
            modifier = Modifier
                .height(height = 32.dp)
        )

        BordeauxButton(text = "Betal")

    }

    }



@Preview(showBackground = true)
@Composable
public fun OrderPagePreview(){
    OrderPage()
}
