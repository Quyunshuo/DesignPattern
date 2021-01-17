package com.quyunshuo.designpattern.creational.factory.method

/**
 * 这是抽象创建者类，它定义了一个抽象的工厂方法，让子类实现此方法制造产品
 * 创建者通常会包含依赖于抽象产品的代码，而这些抽象产品由子类制造。创建者不需要真的知道在哪制造哪种具体产品
 * 比萨店类
 */
abstract class PizzaStore {

    /**
     * 订购比萨
     * @param pizzaType String 订购的比萨类型
     * @return Pizza
     */
    fun orderPizza(pizzaType: String): Pizza? {
        // 将创建比萨的过程替换成工厂对象的创建方法，这里不再使用具体的实例化，不再依赖具体的披萨类型
        val pizza = createPizza(pizzaType)
        return pizza?.apply {
            prepare()
            bake()
            cut()
            box()
        }
    }

    /**
     * 工厂方法是抽象的，所以依赖子类来处理对象的创建
     * 工厂方法必须返回一个产品。超类中定义的方法通常使用到工厂方法的返回值
     * 工厂方法将客户（也就是超类中的代码，例如[orderPizza]和实际创建具体产品的代码分隔开来）
     */
    protected abstract fun createPizza(pizzaType: String): Pizza?
}