package com.quyunshuo.designpattern.creational.factory.method

/**
 * 工厂方法模式 比萨商店-测试
 */
fun main() {

    val nyPizzaStore = NYPizzaStore()
    val chicagoPizzaStore = ChicagoPizzaStore()

    val nyCheesePizza = nyPizzaStore.orderPizza("cheese")
    println(" Ethan ordered a ${nyCheesePizza?.name} \n")

    val chicagoPizza = chicagoPizzaStore.orderPizza("cheese")
    println(" Joel ordered a ${chicagoPizza?.name} ")

    // 输出结果
    // Preparing  NY style Sauce and Cheese Pizza
    // Tossing dough...
    // Adding sauce...
    // Adding toppings:
    //     Grated Reggiano Cheese
    // Bake for 25 minutes at 350
    // Cutting the pizza into diagonal slices
    // Place pizza in official PizzaStore box
    // Ethan ordered a  NY style Sauce and Cheese Pizza
    //
    // Preparing  Chicago Style Deep Dish Cheese Pizza
    // Tossing dough...
    // Adding sauce...
    // Adding toppings:
    //     Shredded Mozzarella Cheese
    // Bake for 25 minutes at 350
    // Cutting the pizza into square slices
    // Place pizza in official PizzaStore box
    // Joel ordered a  Chicago Style Deep Dish Cheese Pizza

    // 两个比萨都准备好了，佐料都加上了，烘烤都完成了，也切片装盒了。
    // 超类从来不管细节。通过实例化正确的比萨类，子类会自行照料这一切
}