package com.quyunshuo.designpattern.behavioral.strategy

/**
 * 嘎嘎叫的实现类
 * 不会叫 安静的行为
 */
class MuteQuack : QuackBehavior {

    override fun quack() {
        println("<< Silence >>")
    }
}