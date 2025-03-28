package dev.jullls.movieapp.domain.model

data class FilmResponse(
    val docs: List<Film>,
    val total: Int,
    val limit: Int,
    val page: Int,
    val pages: Int
)