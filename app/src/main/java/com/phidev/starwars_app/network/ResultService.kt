package com.phidev.starwars_app.network

import com.phidev.starwars_app.model.ResultResponse
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.serialization.kotlinx.json.*

interface ResultService {
    suspend fun getCharacters(): ResultResponse

    companion object{
        fun create():ResultService{
            return ResultServiceImplementation(
                client = HttpClient(Android){
                    install(Logging){
                        level = LogLevel.ALL
                    }
                    install(ContentNegotiation){
                        json()
                    }
                }
            )
        }
    }
}