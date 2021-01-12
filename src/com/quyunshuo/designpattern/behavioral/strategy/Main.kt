package com.quyunshuo.designpattern.behavioral.strategy

/**
 * 策略模式 模拟鸭子应用-测试
 */
fun main() {
    testMallardDuck()
    testModelDuck()
}

/**
 * 绿头鸭测试
 */
fun testMallardDuck() {
    val mallardDuck = MallardDuck()
    mallardDuck.performFly()
    mallardDuck.performQuack()
    mallardDuck.display()
    mallardDuck.swim()
    // 输出结果
    // I'm flying.
    // Quack.
    // I'm a real Mallard duck.
    // All ducks float, even decoys!
}

/**
 * 模型鸭测试
 */
fun testModelDuck() {
    val modelDuck = ModelDuck()
    modelDuck.performFly()
    // 重新设定飞行行为
    modelDuck.setDuckFlyBehavior(FlyRocketPowered())
    modelDuck.performFly()
    // 输出结果
    // I can't fly.
    // I'm flying with a rocket!
}