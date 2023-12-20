package org.example.kotlin.kotlin11

class Player007(_name: String) {

    val name: String
    private fun firstLetter() = name[0];

    init {
        name = _name;
        println(firstLetter())
        /**
         * 类初始化陷阱二
         *
         * 在 init 块中初始化的变量，需要在 init 块中的最前端
         */
        //name = _name;
    }
}

fun main(args: Array<String>) {
    var p = Player007("Jack");
}