package org.example.kotlin.kotlin13

/**
 * 泛型
 */
class MagicBox<T : Human>(vararg item: T) {
    var available = false
    private var subject: Array<out T> = item

    fun fetch(index: Int): T? {
        // takeIf 标准函数，表达式结果为 true 返回函数的调用者
        // 表达式结果为 false 返回 null
        return subject[index].takeIf { available }
    }

    /**
     * return T -> R
     * 业务，把元素进行修改
     * 魔盒里面放的是男孩，取出来的时候，我给他改成了一个男人
     */
    fun <R> fetch(index: Int, subjectMethodFunction: (T) -> R): R? {
        return subjectMethodFunction(subject[index]).takeIf { available }
    }

    operator fun get(index: Int) : T? = subject[index].takeIf { available }

    fun print() {
        println(subject)
    }
}

open class Human(val age: Int) {}

class Boy(val name: String, age: Int) : Human(age) {}

class Man(val name: String, age: Int) : Human(age) {}

class Dog(val weight: Int) {}

fun main(args: Array<String>) {
    val box1 = MagicBox(
            Boy("Jack", 15),
            Boy("Mack", 15)
    )

    // 泛型类型限定不通过
    //val box2 = MagicBox(Dog(20))

    box1.available = true
    box1.fetch(0)?.run {
        println("you find $name")
    }

    box1.fetch(0) { Man(it.name, it.age.plus(15)) }
            ?.run { println("you find $name, $age") } // you find Jack, 30
    box1.fetch(1, { Man(it.name, it.age.plus(15)) })
            ?.run { println("you find $name, $age") } // you find Mack, 30

    // 泛型类型声明 T, R 他们所代表的类型也可以是一样的
    box1.fetch(1, { Boy(it.name, it.age.plus(15)) })
            ?.run { println("you find $name, $age") } // you find Mack, 30

    println("name: ${box1[0]?.name}, age: ${box1[0]?.age}") // name: Jack, age: 15
    println("name: ${box1[1]?.name}, age: ${box1[1]?.age}") // name: Mack, age: 15
}