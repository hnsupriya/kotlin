package com.kotlinwithmongodb.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinApplication

fun main(args: Array<String>) {
	runApplication<KotlinApplication>(*args)
	println("Hello")
}
