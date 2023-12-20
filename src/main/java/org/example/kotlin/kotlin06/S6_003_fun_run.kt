package org.example.kotlin.kotlin06

fun main(args: Array<String>) {

    val str1 = "E:/i have a dream_copy.txt"
    val result = str1.run {
        contains("dream") // 返回 Lambda 结果
    }
    println(result)
}