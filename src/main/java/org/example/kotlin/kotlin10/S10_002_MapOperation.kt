package org.example.kotlin.kotlin10

fun main(args: Array<String>) {

    val mapOf1 = mapOf("Jack" to 20, "Jason" to 18, "Jack" to 30)

    val mapOf2 = mapOf(Pair("Jimmy", 20), Pair("Jack", 20))

    mapOf1.forEach {
        println("${it.key} ${it.value}")
    }

    mapOf1.forEach { key: String, value: Int ->
        println("$key $value")
    }

    mapOf1.forEach { (key: String, value: Int) ->
        println("$key $value")
    }

}