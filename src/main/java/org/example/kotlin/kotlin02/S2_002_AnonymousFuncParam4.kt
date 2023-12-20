package org.example.kotlin.kotlin02

fun main(args: Array<String>) {

    val getDiscountWords = {goodsName:String, hour:Int ->
        val currentYear = 2027
        "${currentYear}年，双11${goodsName}促销倒计时：${hour} 小时"
    }

    showOnBoard("卫生纸", getDiscountWords)
}

fun showOnBoard(goodsName:String, getDiscountWords:(String, Int) -> String){
    val hour = (1..24).shuffled().last()
    println(getDiscountWords(goodsName, hour))
}