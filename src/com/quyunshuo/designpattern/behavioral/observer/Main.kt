package com.quyunshuo.designpattern.behavioral.observer

/**
 * 观察者模式 气象站-测试
 */
fun main() {
    // 创建被观察者 气象数据
    val weatherData = WeatherData()
    // 创建观察者 布告板
    val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)

    // 模拟气象数据
    weatherData.setMeasurements(80F, 65F, 30.4F)
    weatherData.setMeasurements(82F, 70F, 29.2F)

    // 输出结果
    // Current conditions: 80.0F degrees and 65.0% humidity.
    // Current conditions: 82.0F degrees and 70.0% humidity.
}