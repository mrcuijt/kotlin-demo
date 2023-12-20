package org.example.kotlin.kotlin15

// 统计字符串里有多少个元音字母
val String.numVowels
    get() = count { "aeiou".contains(it) }

// 在超类上定义扩展函数，Any 的所有子类都能使用该函数了
fun <T> T.easyPrint(): T {
    println(this)
    return this
}

fun main(args: Array<String>) {
    "The people's Republic of China.".numVowels.easyPrint() // 10
}