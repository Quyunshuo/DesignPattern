package com.quyunshuo.designpattern.behavioral.observer

/**
 * 观察者模式 Observer Pattern
 * 观察者模式定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知，并自动更新
 * 气象站应用 《Head First 设计模式》
 *
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