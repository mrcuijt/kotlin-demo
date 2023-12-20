package org.example.kotlin.kotlin04

const val NAME2 = "Jimmy's friend"

fun main(args: Array<String>) {

    val index:Int = NAME2.indexOf('\'')
    val str = NAME2.substring(0, index)
    var str2 = NAME2.substring(0 until index)
    println(str2)
}