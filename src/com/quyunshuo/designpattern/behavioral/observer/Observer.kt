package com.quyunshuo.designpattern.behavioral.observer

/**
 * 观察者接口 所有的观察者需要实现该接口
 */
interface Observer {
    /**
     * 更新方法
     */
    fun update(temp: Float, humidity: Float, pressure: Float)
}