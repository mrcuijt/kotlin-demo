package org.example.kotlin.kotlin03

fun main(args: Array<String>) {

    var str:String? = "butterfly"

    //str = ""

    str = str?.let {
        // 非空白字符串
        if(it.isNotBlank()){
            it.capitalize()
        } else {
            "butterfly"
        }
    }

    println("str: ${str}")
}