package dev.jullls.movieapp.data.network.api

import dev.jullls.movieapp.domain.model.FilmResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface KinopoiskApi {
    @GET("v1.4/movie")
    suspend fun getTop250(
        @Query("page") page: Int = 1,
        @Query("limit") limit: Int = 250,
        @Query("selectFields") selectFields: List<String> = listOf("id", "name", "year", "poster"),
        @Query("top250") top250: Boolean? = true
    ): FilmResponse

    companion object {
        const val BASE_URL = "https://api.kinopoisk.dev/"
        const val API_KEY = "2JZTBMF-B4TM89H-K2HZM4A-ZX8PKRF"
    }
}
