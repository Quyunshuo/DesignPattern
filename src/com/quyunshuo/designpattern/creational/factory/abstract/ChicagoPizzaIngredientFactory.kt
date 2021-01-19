package com.quyunshuo.designpattern.creational.factory.abstract

/**
 * 抽象工厂的具体工厂
 * 芝加哥风味的原料工厂
 * 对于原料家族的每一种原料，都提供了芝加哥风味
 */
class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough(): Dough = ThickCrustDough()

    override fun createCheese(): Cheese = ShreddedMozzarellaCheese()

    override fun createClam(): Clams = FrozenClams()
}