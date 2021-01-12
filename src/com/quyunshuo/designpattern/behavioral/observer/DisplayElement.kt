package com.quyunshuo.designpattern.behavioral.observer

/**
 * 布告板的抽象接口
 */
interface DisplayElement {
    /**
     * 当布告板需要显示时，调用此方法
     */
    fun display()
}