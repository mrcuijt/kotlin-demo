package org.example.kotlin.kotlin03

fun main(args: Array<String>) {

    var str: String? = "jack"

    str = null

    str = str?.let { it.capitalize() } ?: "butterfly"

    println("str: ${str}")
}