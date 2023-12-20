package org.example.kotlin.kotlin12

/**
 * 对象声明
 *
 * object 关键字声明的类，类名有两种含义（类名、实例名）
 */
object ApplicationConfig {

    init {
        println("ApplicationConfig loading...")
    }

    fun doSomething() {
        println("doSomething")
    }

}

fun main(args: Array<String>) {
    // 类名，实例名
    ApplicationConfig.doSomething()
    println(ApplicationConfig)
    println(ApplicationConfig)
}