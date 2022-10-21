package com.phidev.starwars_app.model

import kotlinx.serialization.Serializable

@Serializable
data class CharacterResponse(
    val character: List<Character>
)
