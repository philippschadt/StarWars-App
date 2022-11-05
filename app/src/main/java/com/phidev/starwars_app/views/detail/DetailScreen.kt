package com.phidev.starwars_app.views.detail


import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import com.phidev.starwars_app.model.Character
import com.phidev.starwars_app.network.ResultService


@Composable
fun DetailScreen(
    name: String?
) {
    val service = ResultService.create()
    val response = produceState(
        initialValue = Character(
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        ),
        producer = {
            value = service.getCharacterByName(name!!)
        })

    Column() {
        Text(text = response.value.name)
        Text(text = response.value.height)
        Text(text = response.value.mass)
        Text(text = response.value.hair_color)
    }
}