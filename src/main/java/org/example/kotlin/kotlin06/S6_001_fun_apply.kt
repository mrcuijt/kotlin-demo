package org.example.kotlin.kotlin06

import java.io.File

fun main(args: Array<String>) {

    val file = File("E:/i have a dream_copy.txt")
    file.setReadable(true)
    file.setWritable(true)
    file.setExecutable(false)

    // 使用 apply
    val block: File.() -> Unit = {
        setReadable(true)
        setWritable(true)
        setExecutable(false)
    }
    val file2 = File("E:/i have a dream_copy.txt").apply(block)

    val file3 = File("E:/i have a dream_copy.txt").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(false)
    }
}