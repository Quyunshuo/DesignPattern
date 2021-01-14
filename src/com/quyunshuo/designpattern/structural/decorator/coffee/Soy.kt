package com.quyunshuo.designpattern.structural.decorator.coffee

/**
 * 豆浆 具体装饰者
 */
class Soy(private val beverage: Beverage) : CondimentDecorator() {

    /**
     * 修改描述
     */
    override fun getDescription(): String {
        return "${beverage.getDescription()},Soy"
    }

    /**
     * 修改价格
     */
    override fun cost(): Double {
        return 0.15 + beverage.cost()
    }
}