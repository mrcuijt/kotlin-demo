package org.example.kotlin.kotlin06

fun main(args: Array<String>) {

    val result = listOf(3, 2, 1).first().let {
        it * it
    }
    println(result) // 9

    val firstElement = listOf(3, 2, 1).first()
    val result2 = firstElement * firstElement
    println(result2) // 9

    println(formatGeeting(null))
    println(formatGeeting("Jack"))

    println(formatGeeting2(null))
    println(formatGeeting2("Jack"))
}

fun formatGeeting(guestName: String?): String {
    return guestName?.let {
        "Welcome $it."
    } ?: "What's your name?"
}

fun formatGeeting2(gustName: String?): String {
    return if (gustName != null) {
        "Welcome $gustName"
    } else {
        "What's your name?"
    }
}