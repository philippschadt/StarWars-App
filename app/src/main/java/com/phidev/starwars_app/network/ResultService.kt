package com.phidev.starwars_app.network

import com.phidev.starwars_app.model.Character
import com.phidev.starwars_app.model.CharacterResult
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.serialization.kotlinx.json.*

interface ResultService {
    suspend fun getCharacters(): CharacterResult
    suspend fun getCharacterByName(name: String): Character

    companion object {
        fun create(): ResultService {
            return ResultServiceImplementation(
                client = HttpClient(Android) {
                    install(Logging) {
                        level = LogLevel.ALL
                    }
                    install(ContentNegotiation) {
                        json()
                    }
                }
            )
        }
    }
}
