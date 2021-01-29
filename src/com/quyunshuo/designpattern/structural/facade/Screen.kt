package com.quyunshuo.designpattern.structural.facade

/**
 * 屏幕
 */
class Screen {

    /**
     * 放下大屏幕
     */
    fun down() {
        println("Screen -> down")
    }

    /**
     * 拉起屏幕
     */
    fun up() {
        println("Screen -> up")
    }
}