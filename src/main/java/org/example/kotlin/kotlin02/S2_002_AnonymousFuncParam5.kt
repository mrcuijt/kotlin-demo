package org.example.kotlin.kotlin02

fun main(args: Array<String>) {
    "Mississippi".count({ it == 's' })
    "Mississippi".count { it == 's' }

    showOnBoard2("卫生纸", { goodsName: String, hour: Int ->
        val currentYear = 2027
        "${currentYear}年，双11${goodsName}促销倒计时：${hour} 小时"
    })

    showOnBoard2("卫生纸") { goodsName: String, hour: Int ->
        val currentYear = 2027
        "${currentYear}年，双11${goodsName}促销倒计时：${hour} 小时"
    }

}

fun showOnBoard2(goodsName: String, showDiscount: (String, Int) -> String) {
    val hour = (1..24).shuffled().last()
    println(showDiscount(goodsName, hour))
}