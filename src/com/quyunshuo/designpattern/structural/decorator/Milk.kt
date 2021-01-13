package com.quyunshuo.designpattern.structural.decorator

/**
 * 牛奶调料 具体装饰者
 */
class Milk(private val beverage: Beverage) : CondimentDecorator() {

    /**
     * 修改描述
     */
    override fun getDescription(): String {
        return "${beverage.getDescription()},Milk"
    }

    /**
     * 修改价格
     */
    override fun cost(): Double {
        return 0.10 + beverage.cost()
    }
}