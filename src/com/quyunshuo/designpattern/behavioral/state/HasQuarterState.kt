package com.quyunshuo.designpattern.behavioral.state

import kotlin.random.Random

/**
 * 有25美分状态
 */
class HasQuarterState constructor(private val gumballMachine: GumballMachine) : State {

    /**
     * 有25美分的时候不应该再放入25美分了
     */
    override fun insertQuarter() {
        println("You can`t insert another quarter")
    }

    /**
     * 退出顾客的25美分，并将状态设置为[NoQuarterState]
     */
    override fun ejectQuarter() {
        println("Quarter returned")
        gumballMachine.setState(gumballMachine.mNoQuarterState)
    }

    /**
     * 当曲柄被转动时，我们将状态设置为[SoldState]
     */
    override fun turnCrank() {
        println("You turned...")
        val nextInt = Random.nextInt(0, 10)
        if (nextInt == 0 && gumballMachine.count > 1) {
            gumballMachine.setState(gumballMachine.mWinnerState)
        } else {
            gumballMachine.setState(gumballMachine.mSoldState)
        }
    }

    /**
     * 该状态下不能直接请求发放糖果 应该先转动曲柄
     */
    override fun dispense() {
        println("No gumball dispensed")
    }
}