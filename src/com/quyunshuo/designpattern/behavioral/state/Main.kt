package com.quyunshuo.designpattern.behavioral.state

/**
 * 测试策略模式下的糖果机
 */
fun main() {
    val gumballMachine = GumballMachine(10)

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    // 输出结果
    // You inserted a quarter
    // You turned...
    // A gumball comes rolling out the slot...
    // You inserted a quarter
    // You turned...
    // A gumball comes rolling out the slot...
    // You inserted a quarter
    // You turned...
    // A gumball comes rolling out the slot...
}