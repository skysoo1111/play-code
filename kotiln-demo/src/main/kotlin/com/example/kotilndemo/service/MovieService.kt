package com.example.kotilndemo.service

import com.example.kotilndemo.domain.Movie
import com.example.kotilndemo.repository.MovieRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class MovieService(
        val movieRepository: MovieRepository
) {

    fun getMovies(): ResponseEntity<Any> {
        val movies = movieRepository.findAll()
        return ResponseEntity.ok(movies)
    }

    fun saveMovie(movie: Movie): ResponseEntity<Any> {
        movieRepository.save(movie)
        return ResponseEntity.ok("success")
    }
}