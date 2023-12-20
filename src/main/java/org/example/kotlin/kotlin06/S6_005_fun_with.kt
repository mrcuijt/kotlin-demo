package org.example.kotlin.kotlin06

fun main(args: Array<String>) {

    val result = "The people's Republic of China.".run {
        length >= 10
    }

    val result2 = with("The people's Republic of China.") {
        length >= 10
    }

    println(result) // true
    println(result2) // true
}