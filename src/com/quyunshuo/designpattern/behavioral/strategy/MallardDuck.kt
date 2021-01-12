package com.quyunshuo.designpattern.behavioral.strategy

/**
 * 绿头鸭
 * 具体的鸭子🦆
 */
class MallardDuck : Duck() {
    init {
        // 会飞
        flyBehavior = FlyWithWings()
        // 会嘎嘎叫
        quackBehavior = Quack()
    }

    override fun display() {
        println(" I'm a real Mallard duck. ")
    }
}