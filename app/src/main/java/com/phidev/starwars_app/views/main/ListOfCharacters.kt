package com.phidev.starwars_app.views.main

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.phidev.starwars_app.model.CharacterResult
import com.phidev.starwars_app.network.ResultService

@Composable
fun ShowListOfCharacters(navController: NavController) {
    val service = ResultService.create()
    val response = produceState(
        initialValue = CharacterResult(emptyList()),
        producer = {
            value = service.getCharacters()
        }
    )
    LazyVerticalGrid(
        columns = GridCells.Adaptive(150.dp),
        content = {
            items(response.value.results.sortedBy { it.name }) {
                CharacterItem(character = it, navController)
            }
        }
    )
}
