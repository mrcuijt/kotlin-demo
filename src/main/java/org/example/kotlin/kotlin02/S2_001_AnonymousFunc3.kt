package org.example.kotlin.kotlin02

fun main(args: Array<String>) {

    // 声明一个函数类型的变量，无输入参数，返回类型为 String
    val blessingFunction:() -> String = {
        val holiday = "New Year."
        // 匿名函数回隐式或自动返回函数体最后一行语句的结果
        "Happy $holiday"
    }

    println(blessingFunction()) // Happy New Year.

    println(blessingFunction) // Function0<java.lang.String>
}