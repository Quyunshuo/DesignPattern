package com.quyunshuo.designpattern.behavioral.template

/**
 * 咖啡☕️
 * 该类继承自[CaffeineBeverage]，所以必须实现父类的抽象方法来完善步骤算法
 */
class Coffee : CaffeineBeverage() {

    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun addCondiments() {
        println("Adding Sugar and Milk")
    }
}