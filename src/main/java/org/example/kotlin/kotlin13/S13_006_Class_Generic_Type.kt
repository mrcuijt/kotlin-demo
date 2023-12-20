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

    */
/**
     * return T -> R
     * 业务，把元素进行修改
     * 魔盒里面放的是男孩，取出来的时候，我给他改成了一个男人
     *//*

    fun <R> fetch(subjectMethodFunction: (T) -> R): R? {
        return subjectMethodFunction(subject).takeIf { available }
    }

    fun print() {
        println(subject)
    }
}

class Boy(val name: String, val age: Int) {}

class Man(val name: String, val age: Int) {}

class Dog(val weight: Int) {}

fun main(args: Array<String>) {
    val box1 = MagicBox(Boy("Jack", 15))
    val box2 = MagicBox(Dog(20))

    box1.print() // Boy
    box2.print() // Dog

    box1.available = true
    box1.fetch()?.run {
        println("you find $name")
    }

    box1.fetch { Man(it.name, it.age.plus(15)) }
            ?.run { println("you find $name, $age") } // you find Jack, 30
    box1.fetch({ Man(it.name, it.age.plus(15)) })
            ?.run { println("you find $name, $age") } // you find Jack, 30
}*/
