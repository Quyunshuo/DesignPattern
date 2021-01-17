package com.quyunshuo.designpattern.creational.factory.simple

/**
 * 简单工厂
 * 封装了所有比萨创建对象的代码，它只做一件事，就是为它的客户创建比萨
 * 该类应该是应用中唯一用到具体披萨类的地方
 */
class SimplePizzaFactory {

    /**
     * 所有客户通过此方法来创建比萨对象
     * @param pizzaType String 比萨类型
     * @return Pizza
     */
    fun createPizza(pizzaType: String): Pizza? {
        return when (pizzaType) {
            "cheese" -> CheesePizza()
            "pepperoni" -> PepperoniPizza()
            "veggie" -> VeggiePizza()
            else -> null
        }
    }
}