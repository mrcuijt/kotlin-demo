package org.example.kotlin.kotlin06

import java.io.File

fun main(args: Array<String>) {

    var basePath = "kotlin-demo/target/classes/demo.txt"

    var fileContents: List<String> // 声明未初始化
    File(basePath)
            .also {
                println(it.name)
            }.also {
                fileContents = it.readLines()
            }
    println(fileContents)
}