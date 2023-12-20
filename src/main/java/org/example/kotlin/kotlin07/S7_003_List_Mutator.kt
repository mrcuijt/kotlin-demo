package org.example.kotlin.kotlin07

fun main(args: Array<String>) {

    val mutableList = mutableListOf("Jason", "Jack", "Jacky")

    mutableList += "Jimmy"
    mutableList -= "Jason"
    mutableList.removeIf { it.contains("Jack") }

    println(mutableList) // [Jimmy]

}