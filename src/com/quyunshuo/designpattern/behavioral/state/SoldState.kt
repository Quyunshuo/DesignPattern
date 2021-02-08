package com.quyunshuo.designpattern.behavioral.state

/**
 * 售出状态
 */
class SoldState constructor(private val gumballMachine: GumballMachine) : State {

    override fun insertQuarter() {
        println("Please wait, we`re already giving you a gumball")
    }

    override fun ejectQuarter() {
        println("Sorry, you already turned the crank")
    }

    override fun turnCrank() {
        println("Turning twice doesn`t get you another gumball!")
    }

    override fun dispense() {
        // 首先需要让机器发放糖果
        gumballMachine.releaseBall()
        // 然后我们需要判断糖果机剩余的糖果，然后将糖果机的状态转换至对应的状态
        if (gumballMachine.count > 0) {
            gumballMachine.setState(gumballMachine.mNoQuarterState)
        } else {
            println("Oops, out of gumballs!")
            gumballMachine.setState(gumballMachine.mSoldOutState)
        }
    }
}