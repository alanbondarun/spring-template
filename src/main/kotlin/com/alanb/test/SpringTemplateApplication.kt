package com.alanb.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringTemplateApplication

fun main(args: Array<String>) {
    runApplication<SpringTemplateApplication>(*args)
}
