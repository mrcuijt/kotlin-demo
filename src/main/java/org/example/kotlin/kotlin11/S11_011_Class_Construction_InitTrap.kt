package org.example.kotlin.kotlin11

class Player006(_name: String) {

    val blood = 100;

    init {
        var bloodBonus = blood.times(4)
    }

    /**
     * 类初始化陷阱一
     *
     * 类属性与 init 是同级的，类属性的声明赋值需要在 init 代码块之前
     */
    //val blood = 100;
}

fun main(args: Array<String>) {
}