package com.quyunshuo.designpattern.behavioral.strategy

/**
 * 嘎嘎叫行为的实现
 */
class Quack : QuackBehavior {

    override fun quack() {
        println(" Quack. ")
    }
}