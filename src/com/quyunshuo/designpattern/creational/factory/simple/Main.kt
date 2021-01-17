package com.quyunshuo.designpattern.creational.factory.simple

/**
 * 简单工厂 比萨店 - 测试
 */
fun main() {
    val factory = SimplePizzaFactory()
    val store = PizzaStore(factory)
    store.orderPizza("cheese")
    // 输出结果
    // Pizza is being preparing...
    // Pizza is being baking...
    // Pizza is being cut...
    // Pizza is being box...
    // Pizza completed!!!
}