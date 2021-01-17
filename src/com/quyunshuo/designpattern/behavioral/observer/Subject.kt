package com.quyunshuo.designpattern.behavioral.observer

/**
 * 主题接口 被观察者需要实现该接口
 */
interface Subject {
    /**
     * 注册成为观察者
     */
    fun registerObserver(o: Observer)

    /**
     * 移除观察者
     */
    fun removeObserver(o: Observer)

    /**
     * 当主题状态改变时，该方法会被调用，以通知所有观察者
     */
    fun notifyObservers()
}