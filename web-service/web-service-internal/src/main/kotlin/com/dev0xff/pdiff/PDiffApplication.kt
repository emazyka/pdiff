package com.dev0xff.pdiff

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class PDiffApplication

fun main(args: Array<String>) {
    runApplication<PDiffApplication>(*args)
}