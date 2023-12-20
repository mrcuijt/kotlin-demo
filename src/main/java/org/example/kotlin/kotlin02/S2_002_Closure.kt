package org.example.kotlin.kotlin02

fun main(args: Array<String>) {
    "Mississippi".count({ it == 's' })
    "Mississippi".count { it == 's' }

    var getDiscountWords = configDiscountWords()

    println(getDiscountWords("沐浴露"))
}

fun configDiscountWords(): (String) -> String {
    val currentYear = 2027
    return { goodsName: String ->
        val hour = (1..24).shuffled().last()
        "${currentYear}年，双11${goodsName}促销倒计时：${hour} 小时"
    };
}