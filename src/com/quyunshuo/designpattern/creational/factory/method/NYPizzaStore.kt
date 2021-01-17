package com.quyunshuo.designpattern.creational.factory.method

/**
 * 能够产生产品的类成为具体创建者
 * 纽约比萨店 加盟自对象村的比萨店
 */
class NYPizzaStore : PizzaStore() {

    /**
     * 这就是创建具体类的地方。对于每一种比萨类型，都是创建纽约风味。
     * 注意 超类的createPizza()方法并不知道正在创建哪一种比萨类型，它只知道这个比萨可以被准备、被烘烤、被切片、被装盒
     */
    override fun createPizza(pizzaType: String): Pizza? {
        return when (pizzaType) {
            "cheese" -> NYStyleCheesePizza()
            else -> null
        }
    }
}