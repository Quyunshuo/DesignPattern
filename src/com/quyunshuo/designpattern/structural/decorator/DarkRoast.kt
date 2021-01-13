package com.quyunshuo.designpattern.structural.decorator

/**
 * 深焙咖啡 具体组件
 */
class DarkRoast : Beverage() {

    override fun getDescription(): String {
        beverageDescription = "DarkRoast"
        return beverageDescription
    }

    override fun cost(): Double {
        return 0.99
    }
}