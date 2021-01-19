package com.quyunshuo.designpattern.creational.factory.abstract

/**
 * 芝士比萨
 */
class CheesePizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {

    override fun prepare() {
        println(" Preparing $name")
        dough = ingredientFactory.createDough()
        cheese = ingredientFactory.createCheese()
        clams = ingredientFactory.createClam()
    }
}