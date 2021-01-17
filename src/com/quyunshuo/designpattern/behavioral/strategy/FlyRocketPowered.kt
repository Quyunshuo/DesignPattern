package com.quyunshuo.designpattern.behavioral.strategy

/**
 * 飞行行为的实现类
 * 利用火箭动力飞行的飞行行为
 */
class FlyRocketPowered : FlyBehavior {

    override fun fly() {
        println(" I'm flying with a rocket! ")
    }
}