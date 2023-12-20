package org.example.kotlin.kotlin12

/**
 * 数据类
 */
data class Coordinate(var x: Int, var y: Int) {
    val isInBounds = x > 0 && y > 0
}

fun main(args: Array<String>) {
    println(Coordinate(10, 20)) // Coordinate(x=10, y=20)
    // == 比较的是内容，equals
    // === 比较的是引用
    println(Coordinate(10, 20) == Coordinate(10, 20))

    // 数据类自身就带有解构声明
    val (x, y) = Coordinate(10, 20)

    println("$x, $y")
}