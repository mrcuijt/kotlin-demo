package org.example.kotlin.kotlin01

fun main(args: Array<String>) {
    val age = 4
    if(age in 0..3){ // [0, 1, 2, 3]
        println("婴幼儿")
    } else if(age in 3..12){ // [3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
        println("少儿")
    } else {
        println("未知")
    }

    // 不在范围内
    if(age !in 0..3){ // not in [0, 1, 2, 3]
        println(age)
    }
}