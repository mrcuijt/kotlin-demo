package org.example.kotlin.kotlin17

import java.io.File

/*
// apply 函数定义
@kotlin.internal.InlineOnly
public inline fun <T> T.apply(block: T.() -> Unit): T {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    block()
    return this
}*/

// 为什么要传入泛型的扩展函数，而不是一个普通的匿名函数？
// T.() -> Unit
// 扩展函数自带了接收者对象的 this 隐式调用

// T.() -> Unit 为一个泛型扩展函数
// File.() -> Unit 为一个 File 类型的扩展函数
// () -> Unit 为普通匿名函数
// 扩展函数自带了接收者对象的 this 隐式调用
inline fun File.apply1(file: File.() -> Unit): File {
    return this;
}

fun main(args: Array<String>) {

    val file = File("xxx").apply1 {
        setReadable(true)
    }

    var a = "a";

    doSomething({ "Demo" }) // Demo
    doSomething(a::toString) // a
}

fun doSomething(fix: () -> String) {
    println(fix())
}