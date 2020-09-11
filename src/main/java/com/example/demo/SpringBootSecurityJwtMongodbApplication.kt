package com.example.demo

import org.springframework.boot.SpringApplication

object SpringBootSecurityJwtMongodbApplication {
    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(SpringBootSecurityJwtMongodbApplication::class.java, *args)
    }
}