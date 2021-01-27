package com.quyunshuo.designpattern.structural.adapter.duck

/**
 * 现在，假设你却鸭子对象，想用一些火鸡对象来冒充。显而易见，因为火鸡的接口不同，所以我们不能公然拿来用
 * 那么，就写个适配器吧
 * 首先，需要实现想转换成的类型接口，也就是你的客户所期望看到的接口
 * 接着，需要取得要适配的对象引用
 */
class TurkeyAdapter(private val turkey: Turkey) : Duck {

    /**
     * 鸭子嘎嘎叫的方法直接调用火鸡的咯咯叫
     */
    override fun quack() {
        turkey.gobble()
    }

    /**
     * 火鸡的飞行距离很短，要让鸭子的飞行和火鸡的飞行能够对应起来，必须连续五次调用火鸡的fly()来完成
     */
    override fun fly() {
        (1..5).forEach { _ -> turkey.fly() }
    }
}