package com.quyunshuo.designpattern.creational.factory.simple

/**
 * 工厂的"产品"，比萨🍕
 * 该类是抽象的，具有一些有用的实现，这些实现也可以被覆盖
 */
abstract class Pizza {

    /**
     * 比萨的准备过程
     */
    fun prepare() {
        println(" Pizza is being preparing... ")
    }

    /**
     * 比萨的烘烤过程
     */
    fun bake() {
        println(" Pizza is being baking... ")
    }

    /**
     * 比萨的裁切过程
     */
    fun cut() {
        println(" Pizza is being cut... ")
    }

    /**
     * 比萨的包装过程
     */
    fun box() {
        println(" Pizza is being box... ")
    }

    /**
     * 制作完成
     */
    fun completed() {
        println(" Pizza completed!!! ")
    }
}