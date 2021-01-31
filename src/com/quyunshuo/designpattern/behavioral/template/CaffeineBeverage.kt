package com.quyunshuo.designpattern.behavioral.template

/**
 * 咖啡因饮料抽象类
 * 茶和咖啡都有咖啡因
 * 它被声明为抽象，用来作为基类，其子类必须实现其操作
 */
abstract class CaffeineBeverage {

    /**
     * 此方法定义了处理茶🍵和咖啡☕️的步骤算法
     * 不将此方法设置为open是因为我们不希望子类覆盖这个方法
     * 这就是模板方法，该方法定义了一连串的步骤，每个步骤由一个方法代表
     */
    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        // 使用hook方法customerWantsCondiments()来控制是否添加调味品
        if (customerWantsCondiments()) {
            addCondiments()
        }
    }

    /**
     * 因为茶和咖啡的冲泡方式有差别 所以这里将冲泡的行为定义为抽象的，让子类去实现细节
     */
    abstract fun brew()

    /**
     * 因为茶和咖啡添加不同的调味品 所以这里将冲泡的行为定义为抽象的，让子类去实现细节
     */
    abstract fun addCondiments()

    /**
     * 因为茶和咖啡都有一样的烧水的行为，所以这里直接写在了基类里
     */
    open fun boilWater() {
        println("Boiling water")
    }

    /**
     * 因为茶和咖啡都有一样的倒进杯子的行为，所以这里直接写在了基类里
     */
    open fun pourInCup() {
        println("Pouring into cup")
    }

    /**
     * hook-钩子🪝
     * 该方法用来控制咖啡因饮料是否进行添加调味品，是一个空实现，子类可以覆写该方法控制算法的流程
     */
    open fun customerWantsCondiments(): Boolean {
        return true
    }
}