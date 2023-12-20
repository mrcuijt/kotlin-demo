package org.example.kotlin.kotlin14

// out 协变
interface Production<out T> {
    fun product(): T
}

// in 逆变
interface Consumer<in T> {
    fun consume(item: T)
}

// 不变
interface ProductConsumer<T> {
    fun product(): T
    fun consume(item: T)
}

open class Food {
    open fun eat() {
        println("Food")
    }
}

open class FastFood : Food() {
    override fun eat() {
        println("FastFood")
    }
}

class Burger : FastFood() {
    override fun eat() {
        println("Burger")
    }
}

// 生产者
class FoodStore : Production<Food> {
    override fun product(): Food {
        println("Produce Food.")
        return Food()
    }
}

// 快餐店
class FastFoodStore : Production<FastFood> {
    override fun product(): FastFood {
        println("Produce FastFood.")
        return FastFood()
    }
}

// 汉堡商店
class BurgerStore : Production<Burger> {
    override fun product(): Burger {
        println("Produce Burger.")
        return Burger()
    }
}

// 消费者
class Everybody : Consumer<Food> {
    override fun consume(item: Food) {
        println("Eat Food.")
        item.eat()
    }
}

class ModernPeople : Consumer<FastFood> {
    override fun consume(item: FastFood) {
        println("Eat FastFood.")
        item.eat()
    }
}

class American : Consumer<Burger> {
    override fun consume(item: Burger) {
        println("Eat Burger.")
        item.eat()
    }
}

fun main(args: Array<String>) {
    // 赋值
    // 子类泛型对象可以赋值给父类泛型对象，用 out。
    val production1: Production<Food> = FoodStore()
    val production2: Production<Food> = FastFoodStore()
    val production3: Production<Food> = BurgerStore()

    // 父类泛型对象可以赋值给子类泛型对象，用 in。
    var consumer1: Consumer<Burger> = Everybody() // Food
    var consumer2: Consumer<Burger> = ModernPeople() // FastFood
    var consumer3: Consumer<Burger> = American() // Burger

    var consumer4: Consumer<Food> = Everybody()
    //var consumer5: Consumer<Food> = ModernPeople() // 子类类型无法赋值给父类类型
    //var consumer6: Consumer<Food> = American() // 子类类型无法赋值给父类类型

    // Consumer 声明时已明确支持的泛型为 Burger，父类实例无法替换子类实例声明
    // consumer1.consume(FastFood())
    consumer1.consume(Burger()) // Eat Food. Burger
    consumer2.consume(Burger()) // Eat FastFood. Burger
    consumer3.consume(Burger()) // Eat Burger. Burger

    // Consumer 声明时已明确支持的泛型为 Food，子类实例可以传递父类实例声明
    consumer4.consume(FastFood()) // Eat Food. FastFood
}
