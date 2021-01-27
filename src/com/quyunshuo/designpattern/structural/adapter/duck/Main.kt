package com.quyunshuo.designpattern.structural.adapter.duck

/**
 * 测试一下我们的适配器
 */
fun main() {
    val duck = MallardDuck()
    val turkey = WildTurkey()
    val adapter = TurkeyAdapter(turkey)

    println("The Turkey says...")
    turkey.gobble()
    turkey.fly()

    println("\nThe Duck says...")
    testDuck(duck)

    println("\nThe TurkeyAdapter says...")
    testDuck(adapter)
    // 输出结果
    // The Turkey says...
    // Gobble gobble
    // I`m flying a short distance
    //
    // The Duck says...
    // Quack
    // I`m flying
    //
    // The TurkeyAdapter says...
    // Gobble gobble
    // I`m flying a short distance
    // I`m flying a short distance
    // I`m flying a short distance
    // I`m flying a short distance
    // I`m flying a short distance

    // 我们让本来不相同的两个接口使用适配器变得"相同"，通过适配器来转换火鸡的行为使其让客户感觉不到其实这个鸭子是个火鸡
    // 火鸡是被适配者 客户和被适配者是解耦的
}

/**
 * 取得一只鸭子并调用它的方法
 * @param duck Duck
 */
fun testDuck(duck: Duck) {
    duck.quack()
    duck.fly()
}