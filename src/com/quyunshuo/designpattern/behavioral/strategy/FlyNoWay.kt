package com.quyunshuo.designpattern.behavioral.strategy

import com.quyunshuo.designpattern.behavioral.strategy.FlyBehavior

/**
 * 飞行行为的实现
 * 给"不会"飞的鸭子用（包括橡皮鸭和诱饵鸭）
 */
class FlyNoWay : FlyBehavior {

    override fun fly() {
        println(" I can't fly. ")
    }
}