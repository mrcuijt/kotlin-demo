package org.example.kotlin.kotlin05

import kotlin.math.roundToInt

fun main(args: Array<String>) {

    println(8.956789.toInt()) // 8 损失精度
    println(8.956789.roundToInt()) // 9 四舍五入
}