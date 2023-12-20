package org.example.kotlin.kotlin07

fun main(args: Array<String>) {

    val mutableList = mutableListOf("Jason", "Jack", "Jacky")

    mutableList.add("Jimmy")
    mutableList.remove("Jack")

    println(mutableList) // [Jason, Jacky, Jimmy]

    // 不可变列表
    val toList = mutableList.toList()

    // 可变列表
    val toMutableList = toList.toMutableList()
}