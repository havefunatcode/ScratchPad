package com.example.scratchpad

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ScratchPadApplication

fun main(args: Array<String>) {
    runApplication<ScratchPadApplication>(*args)
}
