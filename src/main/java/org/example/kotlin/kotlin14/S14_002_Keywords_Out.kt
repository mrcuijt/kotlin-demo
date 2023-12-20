package org.example.kotlin.kotlin14

/**
 * reified 关键字
 */
class MagicBox<T : Human>(vararg item: T) {

    // 随机产生一个对象，如果不是指定类型的对象，就通过 backup 函数生成一个指定类型的对象
    // 使用 inline reified 关键字，使用内联来限定以及确定 Lambda 表达式中返回的泛型的类型
    inline fun <reified T> randomOrBackup(backup: () -> T): T {
        val item = listOf(
                Boy("Jack", 20),
                Man("John", 35)
        )
        val random = item.shuffled().first();
        return if (random is T) {
            random
        } else {
            backup()
        }
    }

}

open class Human(val age: Int) {}
class Boy(val name: String, age: Int) : Human(age) {}
class Man(val name: String, age: Int) : Human(age) {}

fun main(args: Array<String>) {

    val box1 = MagicBox<Human>()
    val man = box1.randomOrBackup { Man("Jimmy", 38) }
    println("man name:${man.name}, age:${man.age}")
}