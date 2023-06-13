package com.example.kotilndemo.repository

import com.example.kotilndemo.domain.Movie
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository : CrudRepository<Movie, String> {
    override fun findAll(): List<Movie>
}