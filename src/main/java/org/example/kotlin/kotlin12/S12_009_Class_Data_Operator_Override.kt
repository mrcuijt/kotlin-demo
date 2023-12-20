package org.example.kotlin.kotlin12

/**
 * 运算符重载
 */
data class Coordinate2(var x: Int, var y: Int) {
    val isInBounds = x > 0 && y > 0

    operator fun plus(other:Coordinate2) = Coordinate2(x + other.x, y + other.y)
}

fun main(args: Array<String>) {
    val c1 = Coordinate2(10, 20)
    val c2 = Coordinate2(10, 20)

    println(c1 + c2)
}