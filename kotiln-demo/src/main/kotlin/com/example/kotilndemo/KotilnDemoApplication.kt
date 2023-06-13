package com.example.kotilndemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class KotilnDemoApplication

fun main(args: Array<String>) {
    runApplication<KotilnDemoApplication>(*args)
}
