package com.phidev.starwars_app.network

object HttpRoutes {
    private const val BASE_URL = "https://swapi.dev/api"
    const val CHARACTERS = "$BASE_URL/people"
    const val CHARACTER_BY_NAME = "https://swapi.dev/api/people/?search="
}