package org.example.kotlin.kotlin13

/**
 * 泛型
 */
/*
class MagicBox<T>(item: T) {
    var available = false
    private var subject: T = item

    fun fetch(): T? {
        // takeIf 标准函数，表达式结果为 true 返回函数的调用者
        // 表达式结果为 false 返回 null
        return subject.takeIf { available }
    }

    fun print() {
        println(subject)
    }
}

class Boy(val name: String, val age: Int) {}

class Dog(val weight: Int) {}

fun main(args: Array<String>) {
    val box1 = MagicBox(Boy("Jack", 20))
    val box2 = MagicBox(Dog(20))

    box1.print() // Boy
    box2.print() // Dog

    box1.available = true
    box1.fetch()?.run {
        println("you find $name")
    }
}*/
