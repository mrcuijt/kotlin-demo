package org.example.kotlin.kotlin11

class Player005(_name: String) {

    var name = _name;

    // 延迟加载惰性初始化
    val config by lazy { loadConfig() }

    private fun loadConfig(): String {
        println("loading...")
        return "xxx"
    }
}

fun main(args: Array<String>) {
    var p = Player005("Jack");
    Thread.sleep(3000);
    println(p.config)
}