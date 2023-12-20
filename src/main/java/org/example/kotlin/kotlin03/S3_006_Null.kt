package org.example.kotlin.kotlin03

fun main(args: Array<String>) {

    var str: String? = "butterfly"

    str = null

    if (str != null) {
        str = str.capitalize();
    } else {
        println("为${str}")
    }

    println("str: ${str}")
}