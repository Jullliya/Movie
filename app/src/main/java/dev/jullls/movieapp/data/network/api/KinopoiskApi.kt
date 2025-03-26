package dev.jullls.movieapp.data.network.api

import dev.jullls.movieapp.data.network.dto.FilmResponseDto

//interface KinopoiskApi {
//
//    @GET(FILM_ENDPOINT)
//    fun getFilms(
//        @Query(PAGE_PARAMETR) page: Int = PAGE_COUNT,
//        @Query(LIMIT_PARAMETR) limit: Int = MAX_PAGE_SIZE_VALUE,
//        @Query(SELECTED_FIELDS_PARAMETR) selectFields: List<String> = SELECTED_FIELDS
//    ): Single<FilmResponseDto>
//
//    companion object {
//        const val BASE_URL = "https://api.kinopoisk.dev/v1.4/"
//        const val API_KEY = "2JZTBMF-B4TM89H-K2HZM4A-ZX8PKRF"
//        const val API_KEY_PARAMETER = "X-API-KEY"
//        private const val FILM_ENDPOINT = "movie"
//        const val MAX_PAGE_SIZE_VALUE = 10
//        private const val PAGE_COUNT = 1
//        private const val PAGE_PARAMETR = "page"
//        private const val LIMIT_PARAMETR = "limit"
//        private const val SELECTED_FIELDS_PARAMETR = "selectFields"
//        private val SELECTED_FIELDS = listOf("id", "name", "year", "poster")
//    }
//}