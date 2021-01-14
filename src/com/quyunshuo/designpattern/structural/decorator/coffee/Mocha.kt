package com.quyunshuo.designpattern.structural.decorator.coffee

/**
 * 摩卡☕️ 具体装饰者
 */
class Mocha(private val beverage: Beverage) : CondimentDecorator() {

    /**
     * 修改描述
     */
    override fun getDescription(): String {
        return "${beverage.getDescription()},Mocha"
    }

    /**
     * 修改价格
     */
    override fun cost(): Double {
        return 0.20 + beverage.cost()
    }
}