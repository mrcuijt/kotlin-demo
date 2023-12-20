package org.example.kotlin.kotlin02

fun main(args: Array<String>) {

    // 声明一个函数类型的变量，无输入参数，返回类型为 String
    val blessingFunction:(String, Int) -> String = { name, year ->
        val holiday = "New Year."
        // 匿名函数回隐式或自动返回函数体最后一行语句的结果
        "$name, Happy $holiday $year"
    }

    println(blessingFunction("Jack", 2027)) // Jack, Happy New Year. 2027

    println(blessingFunction) // Function2<java.lang.String, java.lang.Integer, java.lang.String>
}