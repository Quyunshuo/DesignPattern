package com.quyunshuo.designpattern.structural.adapter.duck

/**
 * 绿头鸭
 */
class MallardDuck : Duck {
    override fun quack() {
        println("Quack")
    }

    override fun fly() {
        println("I`m flying")
    }
}