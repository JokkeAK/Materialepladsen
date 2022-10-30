package com.example.materialepladsenappui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialepladsenappui.ui.theme.BRed

@Composable
fun Receipt(date: String){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Header()

        Text("Kvittering: " +date,
            style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(5.dp)
        )

        LazyColumn(modifier = Modifier
            .background(color = Color.Gray, shape = RectangleShape)
            .fillMaxWidth()
            .height(360.dp)
            .innerShadow(),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally){

            item { MaterialInfoCard()
                Spacer(modifier = Modifier.height(5.dp))}
            items(20){index -> MaterialInfoCard()
                Spacer(modifier = Modifier.height(5.dp))}
        }

        Divider()

        Box(modifier = Modifier
            .fillMaxWidth()) {
            Text(
                text = "\t \t Total",
                style = TextStyle(fontSize = 20.sp)
            )
            Text(
                text = "4.034,50 kr. \t \t",
                modifier = Modifier.align(Alignment.BottomEnd),
                style = TextStyle(fontSize = 20.sp)
            )
        }

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(height = 32.dp))

        BordeauxButton(text = "Eksportér")

    }

}

@Composable
fun Divider(){

    Spacer(modifier = Modifier
        .height(height = 3.dp))

    Divider(
        color = BRed,
        modifier = Modifier
            .fillMaxWidth(0.95F)
            .height(2.dp)
    )
}



//Custom inner shadow code from https://stackoverflow.com/questions/71054138/jetpack-compose-inner-shadow
//Modified to fit our app design
//Inbuilt shadows for backgrounds suck.
fun Modifier.innerShadow() = composed(
    inspectorInfo = {

    },
    factory = {

        val paint = remember() {
            Paint()
        }

        val foregroundPaint = remember() {
            Paint().apply {
                color = Color.Gray
            }
        }

        val frameworkPaint = remember {
            paint.asFrameworkPaint()
        }

        Modifier.drawWithContent {
            this.drawIntoCanvas {
                val color = Color(0x656464)

                val radius = 8.dp.toPx()

                val shadowColor = color
                    .copy(alpha = .7f)
                    .toArgb()
                val transparent = color
                    .copy(alpha = 0f)
                    .toArgb()

                frameworkPaint.color = transparent

                frameworkPaint.setShadowLayer(
                    radius,
                    0f,
                    0f,
                    shadowColor
                )
                val shadowRadius = 8.dp.toPx()

                it.drawRoundRect(
                    left = 0f,
                    top = 0f,
                    right = this.size.width,
                    bottom = this.size.height,
                    radiusX = 5.dp.toPx(),
                    radiusY = 5.dp.toPx(),
                    paint = foregroundPaint
                )

                it.drawRoundRect(
                    left = 0f,
                    top = 0f,
                    right = this.size.width,
                    bottom = this.size.height,
                    radiusX = 5.dp.toPx(),
                    radiusY = 5.dp.toPx(),
                    paint = paint
                )

                it.drawRoundRect(
                    left = shadowRadius,
                    top = shadowRadius,
                    right = this.size.width - shadowRadius,
                    bottom = this.size.height,
                    radiusX = 5.dp.toPx(),
                    radiusY = 5.dp.toPx(),
                    paint = foregroundPaint
                )
                drawContent()

            }
        }
    }
)


@Preview(showBackground = true)
@Composable
fun ReceiptPreview() {
    MyApp {
        Receipt(date = "07/11-2022")
    }
}
