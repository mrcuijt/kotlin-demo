package org.example.kotlin.kotlin13

/**
 * 接口的默认实现
 */
interface Movable {
    // 接口中定义的属性的默认实现方法
    val maxSpeed: Int
        get() = (1..500).shuffled().last()
    var wheels: Int

    fun move(movable: Movable): String
}

class Car(_name: String, override var wheels: Int = 4) : Movable {
    // 实现接口中的属性和函数时必须使用 override 关键字
    override var maxSpeed: Int
    // 属性的 get set 方法都必须要实现
        get() = super.maxSpeed
        set(value) {}

    override fun move(movable: Movable): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}