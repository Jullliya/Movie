package dev.jullls.movieapp.domain.repository

interface FilmRepository {
    fun getFilms(sortFilms: SortFilms): FilmPagingSource
}