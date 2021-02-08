package com.quyunshuo.designpattern.behavioral.state

/**
 * 赢家状态
 * 糖果机🍬有一个活动 当曲柄被转动时，有10%的机率出来的是两颗糖果🍬（多送一颗）
 */
class WinnerState constructor(private val gumballMachine: GumballMachine) : State {

    override fun insertQuarter() {
        println("Please wait, we're already giving you a Gumball")
    }

    override fun ejectQuarter() {
        println("Please wait, we're already giving you a Gumball")
    }

    override fun turnCrank() {
        println("Turning again doesn't get you another gumball!")
    }

    override fun dispense() {
        gumballMachine.releaseBall()
        if (gumballMachine.count == 0) {
            gumballMachine.setState(gumballMachine.mSoldOutState)
        } else {
            gumballMachine.releaseBall()
            println("YOU'RE A WINNER! You got two gumballs for your quarter")
            if (gumballMachine.count > 0) {
                gumballMachine.setState(gumballMachine.mNoQuarterState)
            } else {
                println("Oops, out of gumballs!")
                gumballMachine.setState(gumballMachine.mSoldOutState)
            }
        }
    }
}