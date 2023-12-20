package org.example.kotlin.kotlin12

/**
 * 嵌套类
 */
class Player2 {

    class Equipment(var name: String) {
        fun show() = println("equipment:$name")
    }

    fun battle() {

    }
}

fun main(args: Array<String>) {

    Player2.Equipment("sharp knife").show()
}