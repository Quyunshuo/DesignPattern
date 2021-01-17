package com.quyunshuo.designpattern.creational.factory.method

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
    var dough = ""

    /**
     * 比萨酱料类型
     */
    var sauce = ""

    val toppings = mutableListOf<String>()

    /**
     * 比萨的准备过程
     */
    open fun prepare() {
        println(" Preparing $name ")
        println(" Tossing dough... ")
        println(" Adding sauce... ")
        println(" Adding toppings: ")
        toppings.forEach {
            println("     $it ")
        }
    }

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