package org.example.kotlin.kotlin08

fun main(args: Array<String>) {

    val toList = listOf("Jason", "Jack", "Jacky", "Jack")
            .toSet()
            .toList()

    println(toList)

    println(listOf("Jason", "Jack", "Jacky", "Jack").distinct())
}