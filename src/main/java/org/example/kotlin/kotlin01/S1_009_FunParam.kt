package org.example.kotlin.kotlin01

fun main(args: Array<String>) {
    println(fix2("Jack")) // kotlin.Unit
}

fun fix2(name: String, age: Int = 2) {
    println(name + age) // Jack2
}