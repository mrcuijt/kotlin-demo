package org.example.kotlin.kotlin07

fun main(args: Array<String>) {

    val list = listOf("Jason", "Jack", "Jacky")

    list.forEach {
        println(it)
    }

    list.forEachIndexed { index, item ->
        println("$index $item")
    }
}