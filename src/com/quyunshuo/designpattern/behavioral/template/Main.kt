package com.quyunshuo.designpattern.behavioral.template

/**
 * 测试模板方法模式 - 冲泡咖啡和茶
 */
fun main() {
    val tea = Tea()
    val coffee = Coffee()

    println("Making tea...")
    tea.prepareRecipe()

    println("\nMaking coffee...")
    coffee.prepareRecipe()
    // 输出结果
    // Making tea...
    // Boiling water
    // Steeping the tea
    // Pouring into cup
    // Adding Lemon
    //
    // Making coffee...
    // Boiling water
    // Dripping Coffee through filter
    // Pouring into cup
    // Adding Sugar and Milk
}