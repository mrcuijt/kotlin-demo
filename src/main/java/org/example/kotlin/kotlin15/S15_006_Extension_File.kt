package org.example.kotlin.kotlin15

// 引入扩展函数
import org.example.kotlin.kotlin15.randomTake

fun main(args: Array<String>) {
    val list = listOf("Jason", "Jack", "Tom")
    val set = setOf("Jason", "Jack", "Tom")

    // 未使用扩展函数
    list.shuffled().first()
    set.shuffled().first()

    // 使用扩展函数
    list.randomTake()
    set.randomTake()
}