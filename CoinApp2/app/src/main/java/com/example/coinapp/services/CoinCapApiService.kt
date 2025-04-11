package com.example.coinapp.services

import com.example.coinapp.models.AssetsResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.statement.HttpResponse
import io.ktor.client.request.get
import javax.inject.Inject
class CoinCapApiService @Inject constructor(
    private val client: HttpClient
){
    suspend fun getAssets(): AssetsResponse {
        val response: HttpResponse = client.get(urlString = "https://rest.coincap.io/v3/assets?apiKey=bf4f44a4c3f977ca96ecdf26b12e3bae0cff39bd3b613bdb8b21a2128be0a5a0")
        return response.body()

    }
}