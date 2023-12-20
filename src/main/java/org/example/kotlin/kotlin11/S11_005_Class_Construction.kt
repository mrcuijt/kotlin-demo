package org.example.kotlin.kotlin11


class Player5(
        _name: String,
        var age: Int,
        var isNormal: Boolean
) {

    var name = _name
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }
}

fun main(args: Array<String>) {

    var p = Player5("Jack", 20, true)

    println(p)
}