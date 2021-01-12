package com.quyunshuo.designpattern.behavioral.strategy

/**
 * 嘎嘎叫行为的实现类
 * 吱吱叫
 */
class Squeak : QuackBehavior {

    override fun quack() {
        println(" Squeak ")
    }
}