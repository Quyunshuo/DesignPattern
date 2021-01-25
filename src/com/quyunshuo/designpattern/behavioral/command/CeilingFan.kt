package com.quyunshuo.designpattern.behavioral.command

/**
 * 吊扇
 */
class CeilingFan(private val location: String) {

    private var speed = OFF

    companion object {

        const val HIGH = 3

        const val MEDIUM = 2

        const val LOW = 1

        const val OFF = 0
    }

    fun high() {
        speed = HIGH
        println(" CeilingFan - HIGH ")
    }

    fun medium() {
        speed = MEDIUM
        println(" CeilingFan - MEDIUM ")
    }

    fun low() {
        speed = LOW
        println(" CeilingFan - LOW ")
    }

    fun off() {
        speed = OFF
        println(" CeilingFan - OFF ")
    }

    fun getSpeed(): Int {
        return speed
    }
}