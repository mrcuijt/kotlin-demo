package org.example.kotlin.kotlin05

fun main(args: Array<String>) {

    // val number: Int = "8.98".toInt(); // java.lang.NumberFormatException: For input string: "8.98"

    val number: Int? = "8.98".toIntOrNull()

    println(number) // null

}