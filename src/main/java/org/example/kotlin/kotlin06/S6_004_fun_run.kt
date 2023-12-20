package org.example.kotlin.kotlin06

fun main(args: Array<String>) {

    val result = "The people's Republic of China.".run(::isLong)

    println(result)

    val result2 = "The people's Republic of China."
            .run(::isLong)
            .run(::showMessage)

    println(result2)
}

fun isLong(name: String) = name.length >= 10

fun showMessage(isLong: Boolean): String {
    return if (isLong) {
        "Name is too long."
    } else {
        "Please rename."
    }
}