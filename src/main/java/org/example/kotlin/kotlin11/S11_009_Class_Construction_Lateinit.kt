package org.example.kotlin.kotlin11

class Player004 {
    lateinit var equipment: String

    fun ready() {
        equipment = "sharp knife"
    }

    /**
     * 延迟初始化
     */
    fun battle() {
        if(::equipment.isInitialized)
            println(equipment)
    }
}

fun main(args: Array<String>) {

    var p = Player004()
    //p.ready()
    p.battle() // lateinit property equipment has not been initialized
}