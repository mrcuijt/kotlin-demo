package org.example.kotlin.kotlin08

fun main(args: Array<String>) {

    val mutableSet = mutableSetOf("Jason", "Jack", "Jacky", "Jack")

    mutableSet += "Jimmy"

    println(mutableSet) // [Jason, Jack, Jacky, Jimmy]
}