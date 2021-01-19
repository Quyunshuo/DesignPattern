package com.quyunshuo.designpattern.creational.factory.abstract

/**
 * 抽象工厂模式 比萨商店-测试
 */
fun main() {

    val nyPizzaStore = NYPizzaStore()
    val chicagoPizzaStore = ChicagoPizzaStore()

    val nyCheesePizza = nyPizzaStore.orderPizza("cheese")
    println(" Ethan ordered a ${nyCheesePizza?.name} \n")

    val chicagoPizza = chicagoPizzaStore.orderPizza("cheese")
    println(" Joel ordered a ${chicagoPizza?.name} ")

    // 输出结果
    // Preparing  New York Style Cheese Pizza
    // 生产出薄皮面团 ThinCrustDough
    // 生产出意大利reggiano高级干酪 GratedReggianoCheese
    // 生产出新鲜蛤蜊 FreshClams
    // Bake for 25 minutes at 350
    // Cutting the pizza into diagonal slices
    // Place pizza in official PizzaStore box
    // Ethan ordered a  New York Style Cheese Pizza
    //
    // Preparing  Chicago Style Cheese Pizza
    // 生产出厚皮面团 ThickCrustDough
    // 生产出意大利白干酪 ShreddedMozzarellaCheese
    // 生产出冷冻蛤蜊 FrozenClams
    // Bake for 25 minutes at 350
    // Cutting the pizza into diagonal slices
    // Place pizza in official PizzaStore box
    // Joel ordered a  Chicago Style Cheese Pizza
}