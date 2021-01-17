package com.quyunshuo.designpattern.creational.factory.simple

/**
 * 对象村的比萨店
 * 工厂的客户，该类现在通过[SimplePizzaFactory]取得比萨的实例
 */
class PizzaStore(private val factory: SimplePizzaFactory) {

    /**
     * 订购比萨
     * @param pizzaType String 订购的比萨类型
     * @return Pizza
     */
    fun orderPizza(pizzaType: String): Pizza? {
        // 将创建比萨的过程替换成工厂对象的创建方法，这里不再使用具体的实例化，不再依赖具体的披萨类型
        val pizza = factory.createPizza(pizzaType)
        return pizza?.apply {
            prepare()
            bake()
            cut()
            box()
            completed()
        }
    }
}