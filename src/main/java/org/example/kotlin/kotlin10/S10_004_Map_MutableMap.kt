package org.example.kotlin.kotlin10

fun main(args: Array<String>) {

    val mutableMap = mutableMapOf("Jack" to 20, "Jason" to 18, "Jack" to 30)

    mutableMap += "Jimmy" to 30

    mutableMap.put("Jimmy", 31)

    // getOrPut 键值不存在，就添加并返回结果，否则就返回已有键对应的值
    mutableMap.getOrPut("Rose") { 18 }

    println(mutableMap) // {Jack=30, Jason=18, Jimmy=31, Rose=18}
}