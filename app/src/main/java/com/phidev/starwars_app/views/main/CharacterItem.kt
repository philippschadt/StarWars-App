package com.phidev.starwars_app.views.main

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.phidev.starwars_app.model.Character
import com.phidev.starwars_app.model.ScreenDestinations

@Composable
fun CharacterItem(character: Character, navController: NavController) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color.DarkGray)
            .aspectRatio(1f)
            .clickable {
                navController.navigate(
                    ScreenDestinations.DetailScreen.withArgs(
                        character.name
                    )
                )
            },

        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            CharacterInformation(name = character.name)
        }
    }
}
