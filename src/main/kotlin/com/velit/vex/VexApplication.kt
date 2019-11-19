package com.velit.vex

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VexApplication

fun main(args: Array<String>) {
	runApplication<VexApplication>(*args)
}
