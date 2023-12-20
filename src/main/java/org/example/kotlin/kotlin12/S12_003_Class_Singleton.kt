package org.example.kotlin.kotlin12

/**
 * 对象表达式
 */
open class Player {
    open fun load() = "loading nothing..."
}

fun main(args: Array<String>) {
    /**
     * 通过匿名类方式实例化一个单例的匿名类对象
     */
    var p = object : Player() {
        override fun load(): String = "anonymous nothing"
    }

    println(p.load())
}