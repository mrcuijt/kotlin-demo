package org.example.kotlin.kotlin11


class Student(
        _name: String,
        val age: Int
) {
    var name = _name
    var score = 10
    private val hobby = "music"
    val subject: String

    init {
        println("initializing student...")
        subject = "main"
    }

    constructor(_name: String) : this(_name, 10) {
        score = 20
    }
}

fun main(args: Array<String>) {

    //val stu = Player005(_name = "Jack", age = 10) // name:Jack age:10 subject:main score:10
    val stu = Student("Jack") // name:Jack age:10 subject:main score:20

    println("name:${stu.name} age:${stu.age} subject:${stu.subject} score:${stu.score}")
}