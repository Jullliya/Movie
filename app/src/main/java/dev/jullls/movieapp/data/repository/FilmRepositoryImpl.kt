package dev.jullls.movieapp.data.repository

import dev.jullls.movieapp.data.network.api.KinopoiskApi
import dev.jullls.movieapp.domain.repository.FilmRepository

//class FilmRepositoryImpl @Inject constructor(
//    private val api: KinopoiskApi,
//    private val dao: FilmDao,
//    private val filmPagingSourceFactory: FilmPagingSource.Factory,
//) : FilmRepository {
//
//    override fun getFilms(sortFilms: SortFilm): FilmPagingSource =
//        filmPagingSourceFactory.create(sortFilms = sortFilms)
//}