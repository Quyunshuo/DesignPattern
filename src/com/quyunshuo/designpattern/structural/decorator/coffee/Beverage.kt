package com.quyunshuo.designpattern.structural.decorator.coffee

/**
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