package org.example.kotlin.kotlin11

class Player {

    var name: String = "jack"
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }
}

fun main(args: Array<String>) {

    var p = Player()
    println(p.name) // Jack
    p.name = " rose "
    println(p.name) // Rose

}