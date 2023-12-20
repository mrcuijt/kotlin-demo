package org.example.kotlin.kotlin04

const val NAMES = "Jack,Jacky,Jason"

fun main(args: Array<String>) {

    val split = NAMES.split(",")

    println(split[0])

    // 解构语法
    val (origin, dest, proxy) = NAMES.split(",")

    println("$origin, $dest, $proxy")
}