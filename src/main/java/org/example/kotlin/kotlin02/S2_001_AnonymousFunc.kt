package org.example.kotlin.kotlin02

fun main(args: Array<String>) {
    val total = "Mississippi".count()

    println(total) // 11

    // 通过匿名函数对标准函数制定规则
    val totals = "Mississippi".count({ letter ->
        letter == 's'
    })

    println(totals) // 4
}