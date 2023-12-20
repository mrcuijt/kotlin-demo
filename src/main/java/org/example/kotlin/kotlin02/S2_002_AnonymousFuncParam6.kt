package org.example.kotlin.kotlin02

fun main(args: Array<String>) {
    "Mississippi".count({ it == 's' })
    "Mississippi".count { it == 's' }

    // 要获得函数引用，使用 :: 操作符，后跟要引用的函数名
    showOnBoard3("卫生纸", ::showDiscount)
}

fun showOnBoard3(goodsName: String, showDiscount: (String, Int) -> String) {
    val hour = (1..24).shuffled().last()
    println(showDiscount(goodsName, hour))
}

fun showDiscount(goodsName: String, hour: Int): String {
    val currentYear = 2027
    return "${currentYear}年，双11${goodsName}促销倒计时：${hour} 小时"
}