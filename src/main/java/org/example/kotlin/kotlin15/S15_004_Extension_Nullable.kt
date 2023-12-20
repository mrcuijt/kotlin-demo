package org.example.kotlin.kotlin15

// 可空扩展类型，支持空值类型对象在调用时默认对空指处理的扩展函数
private fun String?.printWithDefault(default: String) = println(this ?: default)

fun main(args: Array<String>) {

    var nullableString: String? = null

    nullableString.printWithDefault("Hello") // Hello

    nullableString = "Jack"

    nullableString.printWithDefault("Hello") // Jack
}