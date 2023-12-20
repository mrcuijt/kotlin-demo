package org.example.kotlin.kotlin04

fun main(args: Array<String>) {

    val str1 = "Jason"

    val str2 = "jason".capitalize()

    println("$str1 $str2") // Jason Jason
    println(str1 == str2) // true
    println(str1 === str2) // false
}