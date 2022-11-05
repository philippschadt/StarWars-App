package com.phidev.starwars_app.network

import com.phidev.starwars_app.model.Character
import com.phidev.starwars_app.model.CharacterResult
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class ResultServiceImplementation(private val client: HttpClient) : ResultService {

    private val json = Json {
        ignoreUnknownKeys = true
    }

    private suspend fun response(apiRoute: String): CharacterResult {
        return json.decodeFromString(
            client
                .get(apiRoute)
                .body()
        )
    }

    override suspend fun getCharacters(): CharacterResult {
        return response(HttpRoutes.CHARACTERS)
    }

    override suspend fun getCharacterByName(name: String): Character {
        return response(HttpRoutes.CHARACTER_BY_NAME + name)
            .results.first()
    }
}