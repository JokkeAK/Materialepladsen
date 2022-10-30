import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.dp

//Custom inner shadow code from https://stackoverflow.com/questions/71054138/jetpack-compose-inner-shadow
//Modified to fit our app design
//Inbuilt shadows for backgrounds suck.
public fun Modifier.innerShadow() = composed(
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