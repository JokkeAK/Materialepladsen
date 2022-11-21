import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.materialepladsenappui.theme.BRed

@Composable
fun DividerBred() {
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height(height = 5.dp)
    )
    Divider(
        color = BRed,
        modifier = Modifier
            .fillMaxWidth()
            .height(3.dp)
    )

}