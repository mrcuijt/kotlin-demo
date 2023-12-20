package org.example.kotlin.kotlin11


class Player7(
        _name: String,
        var age: Int = 20,
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

    init {
        require(age > 0) { "age must be positive" }
        require(name.isNotBlank()) { "player must have a name." }
    }
}

fun main(args: Array<String>) {

    val p1 = Player7("Rose", isNormal = true)

    println("name:${p1.name} age:${p1.age} isNormal:${p1.isNormal}") // name:Rose age:20 isNormal:true
}