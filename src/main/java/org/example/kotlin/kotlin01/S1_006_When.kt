package org.example.kotlin.kotlin01

fun main(args: Array<String>) {
    val school = "A"
    val level:Any = when (school) {
        "学前班" -> "幼儿"
        "小学" -> "少儿"
        "中学" -> "青少年"
        else -> {
            println("未知")
        }
    }

    println(level);
}