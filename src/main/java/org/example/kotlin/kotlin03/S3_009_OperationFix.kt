package org.example.kotlin.kotlin03

fun main(args: Array<String>) {

    var number: Int? = null;

    try {
        checkOperation2(number)
        number!!.plus(1)
    } catch (e: Exception) {
        println(e)
    }
}

fun checkOperation2(number: Int?) {
    //number ?: throw UnskilledException2()
    checkNotNull(number) // java.lang.IllegalStateException: Required value was null.
}

//自定义异常

class UnskilledException2() : IllegalArgumentException("操作不当")