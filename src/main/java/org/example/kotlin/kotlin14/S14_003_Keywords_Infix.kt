package org.example.kotlin.kotlin14

/**
 * infix 关键字
 */
// infix 关键字修饰的函数，接收者和函数之间的点操作以及参数的一对括号都可以不要
// 可空扩展类型，支持空值类型对象在调用时默认对空指处理的扩展函数
private infix fun String?.printWithDefault(default: String) = println(this ?: default)

fun main(args: Array<String>) {

    var nullableString: String? = null

    //nullableString.printWithDefault("Hello") // Hello

    // infix 修饰的单参数函数 printWithDefault 在调用时可以省略点和入参的小括号
    nullableString printWithDefault "Hello" // Hello

    nullableString = "Jack"

    nullableString printWithDefault "Hello"  // Jack

    mapOf("Jack" to 12)

    val pair2: Pair<String, Int> = "Jack".to(12)

    val pair: Pair<String, Int> = "Jack" to 12
}