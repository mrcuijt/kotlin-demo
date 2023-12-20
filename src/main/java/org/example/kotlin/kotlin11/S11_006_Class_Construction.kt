package org.example.kotlin.kotlin11


class Player6(
        _name: String,
        var age: Int,
        var isNormal: Boolean
) {

    var name = _name
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }

    constructor(name: String) : this(name, age = 10, isNormal = false)

    constructor(name: String, age: Int) : this(name, age = 10, isNormal = false) {
        this.name = name.toUpperCase()
    }
}

fun main(args: Array<String>) {

    val p = Player6("Jack", 20, true)

    val p2 = Player6("Rose")

    val p3 = Player6("Jacky", 20)

    println(p3.name) // JACKY
}