package com.quyunshuo.designpattern.behavioral.strategy

/**
 * 飞行行为的实现
 * 给"真会"飞的鸭子用的
 */
class FlyWithWings : FlyBehavior {

    override fun fly() {
        println(" I'm flying. ")
    }
}