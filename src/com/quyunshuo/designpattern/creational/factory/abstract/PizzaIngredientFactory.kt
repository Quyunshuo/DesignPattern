package com.quyunshuo.designpattern.creational.factory.abstract

/**
 * 抽象工厂定义了一个接口，所有的具体工厂都必须实现此接口，这个接口包含一组方法用来生产产品
 */
interface PizzaIngredientFactory {

    /**
     * 用于创建面团的抽象方法
     */
    fun createDough(): Dough

    /**
     * 用于创建奶酪🧀️的抽象方法
     */
    fun createCheese(): Cheese

    /**
     * 用于创建蛤蜊的抽象方法
     */
    fun createClam(): Clams
}