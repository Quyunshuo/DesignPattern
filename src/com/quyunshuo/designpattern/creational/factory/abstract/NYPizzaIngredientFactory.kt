package com.quyunshuo.designpattern.creational.factory.abstract

/**
 * 抽象工厂的具体工厂
 * 纽约风味的原料工厂
 * 对于原料家族的每一种原料，都提供了纽约风味
 */
class NYPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough(): Dough = ThinCrustDough()

    override fun createCheese(): Cheese = GratedReggianoCheese()

    override fun createClam(): Clams = FreshClams()
}