package org.example.kotlin.kotlin15
/*

// 给字符串追加若干个感叹号
fun String.addExt(amount: Int = 1) = this + "!".repeat(amount)

// 在超类上定义扩展函数，Any 的所有子类都能使用该函数了
fun <T> T.easyPrint(): T {
    println(this)
    return this
}

fun main(args: Array<String>) {
    "abc".easyPrint().addExt().easyPrint()
}*/
