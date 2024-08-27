package com.healthcare.claims

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class KotlinApplication

fun main(args: Array<String>) {
	runApplication<KotlinApplication>(*args)
	println("Hi")
}


//  public static void main(String[] args)
// fun main(args:Array<String>)