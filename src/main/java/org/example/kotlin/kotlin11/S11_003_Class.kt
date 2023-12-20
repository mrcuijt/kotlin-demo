package org.example.kotlin.kotlin11

class Player3 {

    var words: String? = "hello"

    fun doSomething() {
        words?.also {
            println("Hello ${it.toUpperCase()}") // Hello HELLO
        }
    }

}

fun main(args: Array<String>) {

    var p = Player3()
    p.doSomething()
}