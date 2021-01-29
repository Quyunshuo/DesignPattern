package com.quyunshuo.designpattern.structural.facade

/**
 * 爆米花
 */
class PopcornPopper {

    /**
     * 打开爆米花机
     */
    fun on() {
        println("PopcornPopper -> on")
    }

    /**
     * 爆出爆米花
     */
    fun pop() {
        println("PopcornPopper -> pop")
    }

    /**
     * 关闭
     */
    fun off() {
        println("PopcornPopper -> off")
    }
}