package org.example.kotlin.kotlin02

fun main(args: Array<String>) {

    // 声明一个函数类型的变量，无输入参数，返回类型为 String
    val blessingFunction:(String) -> String = {
        val holiday = "New Year."
        // 匿名函数回隐式或自动返回函数体最后一行语句的结果
        "$it, Happy $holiday"
    }

    println(blessingFunction("Jack")) // Jack, Happy New Year.

    println(blessingFunction) // Function1<java.lang.String, java.lang.String>
}