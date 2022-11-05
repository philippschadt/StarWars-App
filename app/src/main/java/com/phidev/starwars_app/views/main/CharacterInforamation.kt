package com.phidev.starwars_app.views.main

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign

@Composable
fun CharacterInformation(name: String) {
    Text(
        text = name,
        style = TextStyle(
            textAlign = TextAlign.Center,
            color = Color.Yellow
        ),
    )
}
