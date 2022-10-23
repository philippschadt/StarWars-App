package com.phidev.starwars_app.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.phidev.starwars_app.model.ResultResponse
import com.phidev.starwars_app.network.ResultService

@Composable
fun ShowListOfCharacters() {
    val service = ResultService.create()
    val response = produceState(
        initialValue = ResultResponse(emptyList()),
        producer = {
            value = service.getCharacters()
        })
    LazyVerticalGrid(columns = GridCells.Adaptive(150.dp),
        content = {
            items(response.value.results) {
                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.DarkGray)
                        .aspectRatio(1f),

                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        it.name, style = TextStyle(Color.Yellow),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

            }
        })
}