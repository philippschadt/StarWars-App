package com.phidev.starwars_app.model

import kotlinx.serialization.Serializable

@Serializable
data class ResultResponse(
    val results: List<Result>
)