package org.example.kotlin.kotlin12

/**
 * 解构语法
 */
class PlayerScore(val experience: Int, val level: Int) {
    // 解构声明
    operator fun component1() = experience

    operator fun component2() = level
}

fun main(args: Array<String>) {
    val (x, y) = PlayerScore(10, 20)
    println("$x, $y")
}