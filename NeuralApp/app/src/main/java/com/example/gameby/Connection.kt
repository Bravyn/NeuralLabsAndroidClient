package com.example.gameby


import androidx.annotation.UiThread
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.*
import io.ktor.client.features.get
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.coroutines.runBlocking

@UiThread
suspend fun maine() : HttpStatusCode {
    val client = HttpClient(CIO)
    val response: HttpResponse = client.get("https://ktor.io/")
    return response.status
}


@Composable
fun Status(content: HttpStatusCode){
    Text(text = content.toString())
}