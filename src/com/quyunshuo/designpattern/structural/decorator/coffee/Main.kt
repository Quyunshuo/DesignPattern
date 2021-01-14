package com.quyunshuo.designpattern.structural.decorator.coffee

/**
 * 装饰者模式 星巴兹咖啡应用-测试
 */
fun main() {
    // 订一杯 Espresso（浓缩咖啡），不需要调料，打印出它的描述与价格
    val beverage: Beverage = Espresso()
    println("${beverage.getDescription()} \$${beverage.cost()}")
    // 输出结果
    // Espresso $1.99


    // 订一杯 DarkRoast（深焙咖啡），加双份摩卡，加一份牛奶，打印出它的描述与价格
    var beverage2: Beverage = DarkRoast()
    // 使用装饰者摩卡 对深焙咖啡进行装饰
    beverage2 = Mocha(beverage2)
    // 第二份摩卡
    beverage2 = Mocha(beverage2)
    println("${beverage2.getDescription()} \$${beverage2.cost()}")
    // 输出结果
    // DarkRoast,Mocha,Mocha $1.39


    // 再来一杯调料为牛奶、豆浆、摩卡的HouseBlend（综合咖啡）
    var beverage3: Beverage = HouseBlend()
    beverage3 = Milk(beverage3)
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    println("${beverage3.getDescription()} \$${beverage3.cost()}")
    // 输出结果
    // HouseBlend,Milk,Soy,Mocha $1.3399999999999999
}