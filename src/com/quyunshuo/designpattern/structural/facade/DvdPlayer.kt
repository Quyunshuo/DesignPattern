package com.quyunshuo.designpattern.structural.facade

/**
 * DVD
 */
class DvdPlayer {

    /**
     * 打开DVD
     */
    fun on() {
        println("DvdPlayer -> on")
    }

    /**
     * 播放DVD
     */
    fun play() {
        println("DvdPlayer -> play")
    }

    /**
     * 暂停DVD
     */
    fun stop() {
        println("DvdPlayer -> stop")
    }

    /**
     * 弹出DVD
     */
    fun eject() {
        println("DvdPlayer -> eject")
    }

    /**
     * 关闭
     */
    fun off() {
        println("DvdPlayer -> off")
    }
}