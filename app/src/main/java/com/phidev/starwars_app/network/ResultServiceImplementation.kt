package com.phidev.starwars_app.network

import com.phidev.starwars_app.model.ResultResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class ResultServiceImplementation(private val client: HttpClient):ResultService {
    override suspend fun getCharacters(): ResultResponse {
        val json = Json{
            ignoreUnknownKeys = true

        }

        val body = client.get(HttpRoutes.PEOPLE)
            .body<String>()

        return json.decodeFromString(body)
    }
}