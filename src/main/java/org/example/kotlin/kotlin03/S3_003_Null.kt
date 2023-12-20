package org.example.kotlin.kotlin03

fun main(args: Array<String>) {

    var str:String? = "butterfly"

    str = null

    str?.decapitalize()

    println("str: ${str}")
}