package org.example.kotlin.kotlin12

import java.io.File

/**
 * 类默认都是封闭的无法被继承，被 open 关键字修饰的类可以被子类继承
 */
open class Product(val name: String) {

    fun description() = "Product: $name"

    /**
     * 方法默认是封闭的无法被子类重写，被 open 关键字修饰的方法可以被子类重写
     */
    open fun load() = "Nothing..."
}

class LuxuryProduct : Product("Luxury") {

    /**
     * 子类重写的父类方法时需要使用 override 关键字修饰
     */
    override fun load() = "LuxuryProduct loading..."

    fun special() = "LuxuryProduct special function"
}

fun main(args: Array<String>) {
    val p: Product = LuxuryProduct()
    println(p.load())

    println(p is Product)       // true
    println(p is LuxuryProduct) // true
    println(p is File)          // false

    if(p is LuxuryProduct){
        println((p as LuxuryProduct).special())
        println(p.special()) // is 成立后智能类型转换
    }

    println(p is Any) // true

    println(p is Object)
}