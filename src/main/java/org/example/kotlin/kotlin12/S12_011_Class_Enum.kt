package org.example.kotlin.kotlin12

/**
 * 枚举类
 */
enum class Direction2(private val coordinate: Coordinate) {

    // 因为枚举类的构造函数带参数，所以定义每个枚举常量时，
    // 需要传入 Coordinate 对象，调用构造函数
    EAST(Coordinate(1, 0)),
    WEST(Coordinate(-1, 0)),
    SOUTH(Coordinate(-1, 0)),
    NORTH(Coordinate(1, 0));

    fun updateCoordinate(playerCoordinate: Coordinate) =
            Coordinate(playerCoordinate.x + coordinate.x, playerCoordinate.y + coordinate.y)

}

fun main(args: Array<String>) {
    println(Direction2.EAST)
    // 调用函数时，使用的是枚举常量，所以应该这样调用
    println(Direction2.EAST.updateCoordinate(Coordinate(10, 20)))
}