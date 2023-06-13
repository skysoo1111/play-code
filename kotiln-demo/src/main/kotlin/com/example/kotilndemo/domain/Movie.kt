package com.example.kotilndemo.domain

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import javax.annotation.processing.Generated

@RedisHash("movie", timeToLive = 30)
data class Movie(
        @Id
        @Generated
        val id: Number,
        val name: String
)
