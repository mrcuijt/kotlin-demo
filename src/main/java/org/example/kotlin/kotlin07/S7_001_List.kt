package org.example.kotlin.kotlin07

fun main(args: Array<String>) {

    val list = listOf("Jason", "Jack", "Jacky")

    // list[4] // java.lang.ArrayIndexOutOfBoundsException: 4
    println(list.getOrElse(3) { "Unknow" }) // Unknow
    println(list.getOrNull(3)) // null
    println(list.getOrNull(3) ?: "Unknow") // Unknow

}