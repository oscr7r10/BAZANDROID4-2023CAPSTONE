package com.example.usecases

import com.example.data.repository.MoviesRepositoryImpl
import com.example.domain.model.LatestMovieModel
import com.example.domain.util.ResultApi
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetLatestMoviesUseCase @Inject constructor(
    private val repository : MoviesRepositoryImpl
    ) {

    operator fun invoke() : Flow<ResultApi<LatestMovieModel>> {
        return repository.getLatestMovies()
    }

}