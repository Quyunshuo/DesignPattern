package com.quyunshuo.designpattern.structural.adapter.duck

/**
 * 真实火鸡🦃️
 */
class WildTurkey : Turkey {

    override fun gobble() {
        println("Gobble gobble")
    }

    override fun fly() {
        println("I`m flying a short distance")
    }
}