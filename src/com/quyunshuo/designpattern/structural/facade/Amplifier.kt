package com.quyunshuo.designpattern.structural.facade

/**
 * 功放
 */
class Amplifier {

    /**
     * 打开功放
     */
    fun on() {
        println("Amplifier -> on")
    }

    /**
     * 设置DVD
     */
    fun setDvd() {
        println("Amplifier -> setDvd")
    }

    /**
     * 设置环绕声
     */
    fun setSurroundSound() {
        println("Amplifier -> setSurroundSound")
    }

    /**
     * 设定音量
     */
    fun setVolume(volume: Int) {
        println("Amplifier -> setVolume $volume")
    }

    /**
     * 关闭
     */
    fun off() {
        println("Amplifier -> off")
    }
}