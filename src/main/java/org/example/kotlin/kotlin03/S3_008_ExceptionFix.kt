package org.example.kotlin.kotlin03

fun main(args: Array<String>) {

    var number: Int? = null;

    try {
        checkOperation(number)
        number!!.plus(1)
    } catch (e: Exception) {
        println(e)
    }
}

fun checkOperation(number: Int?) {
    number ?: throw UnskilledException()
}

//自定义异常

class UnskilledException() : IllegalArgumentException("操作不当")