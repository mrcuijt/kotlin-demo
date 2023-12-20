package org.example.kotlin.kotlin03

fun main(args: Array<String>) {

    var str:String? = "butterfly"

    str = null

    str = str!!.capitalize() // kotlin.KotlinNullPointerException

    println("str: ${str}")
}