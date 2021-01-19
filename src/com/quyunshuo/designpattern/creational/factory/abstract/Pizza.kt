package com.quyunshuo.designpattern.creational.factory.abstract

/**
 * 产品类 对[PizzaStore]创建者来说，产品就是[Pizza]
 * 抽象比萨🍕，所有的具体比萨都必须派生自这个类
 */
abstract class Pizza {

    /**
     * 比萨名称
     */
    var name = ""

    /**
     * 比萨面团类型
     */
    lateinit var dough: Dough

    /**
     * 比萨蛤蜊类型
     */
    lateinit var clams: Clams

    /**
     * 比萨奶酪类型
     */
    lateinit var cheese: Cheese

    /**
     * 比萨的准备过程
     * 该方法声明为抽象，在这个方法中，我们需要收集比萨所需要的原料，而这些原料来自于原料工厂
     */
    abstract fun prepare()

    /**
     * 比萨的烘烤过程
     */
    open fun bake() {
        println(" Bake for 25 minutes at 350 ")
    }

    /**
     * 比萨的裁切过程
     */
    open fun cut() {
        println(" Cutting the pizza into diagonal slices ")
    }

    /**
     * 比萨的包装过程
     */
    open fun box() {
        println(" Place pizza in official PizzaStore box ")
    }
}