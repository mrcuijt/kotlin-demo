package org.example.kotlin.kotlin10

fun main(args: Array<String>) {

    val mapOf1 = mapOf("Jack" to 20, "Jason" to 18, "Jack" to 30)

    val mapOf2 = mapOf(Pair("Jimmy", 20), Pair("Jack", 20))

    println(mapOf1["Jack"]) // 30
    println(mapOf1.getValue("Jack")) // 30
    println(mapOf1.getOrElse("Rose") { "Unknow" }) // Unknow
    println(mapOf1.getOrDefault("Rose", 0)) // 0
}