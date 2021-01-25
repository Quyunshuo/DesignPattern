package com.quyunshuo.designpattern.behavioral.command

/**
 * 音响
 */
class Stereo {

    /**
     * 打开
     */
    fun on() {
        println(" Stereo -> on ")
    }

    /**
     * 设置CD
     */
    fun setCD() {
        println(" Stereo -> set CD ")
    }

    /**
     * 设置音量
     * @param int Int 音量
     */
    fun setVolume(int: Int) {
        println(" Stereo -> set volume $int ")
    }

    /**
     * 关闭
     */
    fun off() {
        println(" Stereo -> off ")
    }
}