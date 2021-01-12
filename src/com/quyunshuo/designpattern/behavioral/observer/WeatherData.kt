package com.quyunshuo.designpattern.behavioral.observer

import java.util.ArrayList

/**
 * 气象数据 被观察者
 */
class WeatherData : Subject {

    private var observers: ArrayList<Observer> = ArrayList()

    private var temperature: Float = 0F

    private var humidity: Float = 0F

    private var pressure: Float = 0F

    /**
     * 当注册观察者时，将观察者添加到[observers]中
     */
    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    /**
     * 当观察者取消注册时，将观察者从[observers]中移除
     */
    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    /**
     * 通知观察者 更新数据
     */
    override fun notifyObservers() {
        observers.forEach {
            it.update(temperature, humidity, pressure)
        }
    }

    /**
     * 当从气象站得到更新的数据时 就要通知观察者
     */
    fun measurementsChanged() {
        notifyObservers()
    }

    /**
     * 可以使用该方法 测试气象数据
     */
    fun setMeasurements(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}