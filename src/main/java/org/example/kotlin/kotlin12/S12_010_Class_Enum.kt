package org.example.kotlin.kotlin12

/**
 * 枚举类
 */
enum class Direction {

    EAST,
    WEST,
    SOUTH,
    NORTH

}

fun main(args: Array<String>) {

    println(Direction.EAST) // EAST
    println(Direction.EAST is Direction) // true
}