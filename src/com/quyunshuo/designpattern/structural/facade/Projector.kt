package com.quyunshuo.designpattern.structural.facade

/**
 * 投影机
 */
class Projector {

    /**
     * 打开投影机
     */
    fun on() {
        println("Projector -> on")
    }

    /**
     * 宽屏模式
     */
    fun wideScreenMode() {
        println("Projector -> wideScreenMode")
    }

    /**
     * 关闭
     */
    fun off() {
        println("Projector -> off")
    }
}