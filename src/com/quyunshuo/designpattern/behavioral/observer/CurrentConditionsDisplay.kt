package com.quyunshuo.designpattern.behavioral.observer

/**
 * 目前状况布告板
 */
class CurrentConditionsDisplay(weatherData: Subject) : Observer, DisplayElement {
    init {
        // 注册成为观察者
        weatherData.registerObserver(this)
    }

    private var temperature: Float = 0F

    private var humidity: Float = 0F

    override fun display() {
        println(" Current conditions: ${temperature}F degrees and ${humidity}% humidity. ")
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        // 取到自己需要的数据
        this.temperature = temp
        this.humidity = humidity
        display()
    }
}