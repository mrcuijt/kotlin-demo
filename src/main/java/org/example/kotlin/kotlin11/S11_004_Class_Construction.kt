package org.example.kotlin.kotlin11

import kotlin.math.absoluteValue

class Player4(
        _name: String,
        _age: Int,
        _isNormal: Boolean
) {

    var name = _name
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }
    var age = _age
        get() = age.absoluteValue
        set(value) {
            field = age.absoluteValue
        }
    var isNormal = _isNormal

}

fun main(args: Array<String>) {

    var p = Player4("Jack", 20, true)
    // p.name = "rose"

    println(p)
}