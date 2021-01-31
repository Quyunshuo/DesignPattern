package com.quyunshuo.designpattern.behavioral.template

/**
 * 茶🍵
 * 该类继承自[CaffeineBeverage]，所以必须实现父类的抽象方法来完善步骤算法
 */
class Tea : CaffeineBeverage() {

    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding Lemon")
    }
}