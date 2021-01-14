package com.quyunshuo.designpattern.structural.decorator.coffee

/**
 * 综合咖啡 具体组件
 */
class HouseBlend : Beverage() {

    /**
     * 重写描述
     */
    override fun getDescription(): String {
        beverageDescription = "HouseBlend"
        return beverageDescription
    }

    /**
     * 重写价格
     */
    override fun cost(): Double {
        return 0.89
    }
}