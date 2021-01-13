package com.quyunshuo.designpattern.structural.decorator

/**
 * 装饰者模式 Decorator Pattern
 * 装饰者模式动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案
 * 星巴兹咖啡应用 《Head First 设计模式》
 *
 * 饮料 抽象组件
 */
abstract class Beverage {

    /**
     * 饮料的描述
     */
    var beverageDescription = "Unknown Beverage"


    abstract fun getDescription(): String

    /**
     * 成本 价钱
     */
    abstract fun cost(): Double
}