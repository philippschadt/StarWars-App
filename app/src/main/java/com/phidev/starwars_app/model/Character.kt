package com.phidev.starwars_app.model

import kotlinx.serialization.Serializable

@Serializable
data class Character(
    val name: String,
    val height: String,
    val mass: String,
    val hair_color: String,
    val skin_color: String,
    val eye_color: String,
    val birth_year: String,
    val gender: String,
)