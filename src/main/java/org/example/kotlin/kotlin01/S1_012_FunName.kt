package org.example.kotlin.kotlin01

fun main(args: Array<String>) {
    /**
     * 一个奇怪名字的方法
     *
     * 这些带有特殊符号或空格的可以方便的对一些测试用例名称命名
     */
    `**~special function with weird name~**`() // I am weird.

    /**
     * is 是 Kotlin 中的关键字，
     * 为了保证与 Java 之间的互操作使用 `` 号括住函数名可避 Kotlin 在调用 Java 时的语法冲突。
     */
    S1_012_FunName.`is`() // is invoked.
}

fun `**~special function with weird name~**`() {
    println("I am weird.")
}