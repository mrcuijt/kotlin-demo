package org.example.kotlin.kotlin11

class Player008(_name: String) {

    val name: String = _name
    /**
     * 类初始化陷阱三
     *
     * 属性字段引用时需注意属性字段初始化的顺序，否则会出现属性值为空
     */
    val playerName: String = initPlayerName()

    //val name: String = _name
    private fun initPlayerName() = name;
}

fun main(args: Array<String>) {
    var p = Player008("Jack");
    println(p.playerName) // null
    println(p.name)
}