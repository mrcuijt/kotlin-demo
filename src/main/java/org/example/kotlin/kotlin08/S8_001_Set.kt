package org.example.kotlin.kotlin08

fun main(args: Array<String>) {

    val set = setOf("Jason", "Jack", "Jacky", "Jack")

    println(set.elementAt(0)) // Jason

    println(set.elementAt(1)) // Jack

    println(set.elementAtOrElse(4) { "Unknow" }) // Unknow

    println(set.elementAtOrNull(4)) // null

    println(set) // [Jason, Jack, Jacky]
}