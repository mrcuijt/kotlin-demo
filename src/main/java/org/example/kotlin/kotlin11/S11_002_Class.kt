package org.example.kotlin.kotlin11

class Player2 {

    var rolledValue = 0
        get() = (1..6).shuffled().first()

}

fun main(args: Array<String>) {

    var p = Player2()
    println(p.rolledValue) // 2
}