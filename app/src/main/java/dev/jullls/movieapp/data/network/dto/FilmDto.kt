package dev.jullls.movieapp.data.network.dto

data class FilmDto(
    val id: Long,
    val name: String,
    val poster: List<String>,
    val year: Int
)
