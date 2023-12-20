package org.example.kotlin.kotlin01

fun main(args: Array<String>) {
    fix(age = 4, name = "Jack") // Jack4
}

fun fix(name: String, age: Int = 2) {
    println(name + age)
}