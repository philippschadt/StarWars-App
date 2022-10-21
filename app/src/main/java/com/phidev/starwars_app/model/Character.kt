package com.phidev.starwars_app.model

import kotlinx.serialization.Serializable

@Serializable
data class Character(
    val birth_year: String,
    val eye_color: String,
    val gender: String,
    val hair_color: String,
    val height: String,
    val mass: String,
    val name: String,
    val skin_color: String
)