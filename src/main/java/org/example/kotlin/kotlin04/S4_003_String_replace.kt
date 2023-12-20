package org.example.kotlin.kotlin04

fun main(args: Array<String>) {

    val str1 = "The people's Republic of China."

    val str2 = str1.replace(Regex("[aeiou]")){
        when(it.value){
            "a" -> "8"
            "e" -> "6"
            "i" -> "9"
            "o" -> "1"
            "u" -> "3"
            else -> it.value
        }
    }
    println(str1)
    println(str2)
}