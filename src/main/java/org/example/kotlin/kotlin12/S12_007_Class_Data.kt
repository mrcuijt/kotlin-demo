package org.example.kotlin.kotlin12

/**
 * copy 函数
 */
data class Student(val name: String, val age: Int) {
    private val hobby = "music"
    val subject: String
    var score: Int = 0

    init {
        println("initializing student...")
        subject = "main"
    }

    constructor(_name: String) : this(_name, 10) {
        this.score = 10
    }

    override fun toString(): String {
        return "Student(name='$name', age=$age, hobby='$hobby', subject='$subject', score=$score)"
    }


}

fun main(args: Array<String>) {
    val stu = Student("Jack") // 次构造
    val copy = stu.copy("Rose") // 主构造

    println(stu) // score : 10 // Student(name='Jack', age=10, hobby='music', subject='main', score=10)
    println(copy) // score : 0 // Student(name='Rose', age=10, hobby='music', subject='main', score=0)
}