package org.example.kotlin.kotlin15

// 引入扩展函数，对其取别名
import org.example.kotlin.kotlin15.randomTake as randomizer

fun main(args: Array<String>) {
    val list = listOf("Jason", "Jack", "Tom")
    val set = setOf("Jason", "Jack", "Tom")

    // 未使用扩展函数
    list.shuffled().first()
    set.shuffled().first()

    // 使用扩展函数别名
    list.randomizer()
    set.randomizer()
}