package com.phidev.starwars_app.model

import kotlinx.serialization.Serializable

@Serializable
data class CharacterResult(
    val results: List<Character>
)