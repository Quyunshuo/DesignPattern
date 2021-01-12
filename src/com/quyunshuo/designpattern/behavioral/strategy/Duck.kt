package com.quyunshuo.designpattern.behavioral.strategy

/**
 * 策略模式 Strategy Pattern
 * 策略模式定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户
 *
 * 模拟鸭子应用 《Head First 设计模式》
 */
abstract class Duck {

    var flyBehavior: FlyBehavior? = null

    var quackBehavior: QuackBehavior? = null

    /**
     * 鸭子外观
     */
    abstract fun display()

    /**
     * 委托给行为类
     */
    fun performFly() {
        flyBehavior?.fly()
    }

    /**
     * 委托给行为类
     */
    fun performQuack() {
        quackBehavior?.quack()
    }

    /**
     * 设定鸭子的飞行行为
     */
    fun setDuckFlyBehavior(fb: FlyBehavior) {
        flyBehavior = fb
    }

    /**
     * 设定鸭子的嘎嘎叫行为
     */
    fun setDuckQuackBehavior(qb: QuackBehavior) {
        quackBehavior = qb
    }

    /**
     * 游泳
     */
    fun swim() {
        println(" All ducks float, even decoys! ")
    }
}