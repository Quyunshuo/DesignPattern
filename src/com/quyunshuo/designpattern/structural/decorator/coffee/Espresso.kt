package com.quyunshuo.designpattern.structural.decorator.coffee

/**
 * 浓缩咖啡 具体组件
 */
class Espresso : Beverage() {

    /**
     * 重写描述
     */
    override fun getDescription(): String {
        beverageDescription = "Espresso"
        return beverageDescription
    }

    /**
     * 重写价格
     */
    override fun cost(): Double {
        return 1.99
    }
}