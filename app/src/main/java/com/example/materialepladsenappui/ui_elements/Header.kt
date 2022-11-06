package com.example.materialepladsenappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
public fun Header() {

    androidx.compose.material3.Button(
        onClick = { /*TODO*/ },
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
        )
    ) {
        Image(
            painter = painterResource(id = R.drawable.mp_logo_text),
            contentDescription = "materialepladsen logo",
            modifier = Modifier
                .width(194.dp)
                .height(56.dp),
            alignment = Alignment.TopCenter
        )
    }
}