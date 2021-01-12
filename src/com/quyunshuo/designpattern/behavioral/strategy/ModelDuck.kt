package com.quyunshuo.designpattern.behavioral.strategy

/**
 * 模型鸭
 */
class ModelDuck : Duck() {
    init {
        // 一开始不会飞
        flyBehavior = FlyNoWay()
        // 会嘎嘎叫
        quackBehavior = Quack()
    }

    override fun display() {
        println(" I'm a model duck. ")
    }
}