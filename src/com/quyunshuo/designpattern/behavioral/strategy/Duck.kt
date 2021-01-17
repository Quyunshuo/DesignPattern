package com.quyunshuo.designpattern.behavioral.strategy

/**
 * 抽象鸭子类
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