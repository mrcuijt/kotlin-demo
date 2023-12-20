package org.example.kotlin.kotlin06

import java.io.File

fun main(args: Array<String>) {

    var basePath = "kotlin-demo/target/classes/demo.txt"

    val text = File(basePath).takeUnless {
        it.isHidden
    }?.readText()

    println(text)
}