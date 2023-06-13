package com.example.kotilndemo.controller

import com.example.kotilndemo.domain.Movie
import com.example.kotilndemo.service.MovieService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class MovieController(
        val movieService: MovieService
) {
    @GetMapping("/movies")
    fun getMovies(): ResponseEntity<Any> {
        return movieService.getMovies()
    }

    @PostMapping("/movie")
    fun saveMovie(@RequestBody movie: Movie): ResponseEntity<Any> {
        val result = movieService.saveMovie(movie)
        return ResponseEntity.ok(result)
    }
}