package org.example.kotlin.kotlin12

import java.io.File

/**
 * 伴生对象
 */
open class ConfigMap {

    /**
     * 伴生对象只有在 ConfigMap 实例化 或 调用 ConfigMap.load() 函数时才会实例化
     * 并且伴生对象只会实例化一次
     */
    companion object {
        private const val PATH = "xxx"

        fun load() = File(PATH).readBytes()
    }
}

fun main(args: Array<String>) {
    ConfigMap.load()
}