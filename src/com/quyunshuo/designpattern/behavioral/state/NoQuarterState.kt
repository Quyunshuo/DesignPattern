package com.quyunshuo.designpattern.behavioral.state

/**
 * 没有25美分状态
 */
class NoQuarterState constructor(private val gumballMachine: GumballMachine) : State {

    /**
     * 如果有人投入了25美分，我们就打印出一条消息说我们接受了25美分，然后改变糖果机的状态到[HasQuarterState]
     */
    override fun insertQuarter() {
        println("You inserted a quarter")
        gumballMachine.setState(gumballMachine.mHasQuarterState)
    }

    /**
     * 当前的状态是没有25美分 所以当想要取出25美分时 是绝对不行的🙅
     */
    override fun ejectQuarter() {
        println("You haven`t inserted a quarter")
    }

    /**
     * 当前是没有25美分状态 所以不能要求糖果🍬
     */
    override fun turnCrank() {
        println("You turned,but there`s no quarter")
    }

    /**
     * 现在是没有25美分的状态  所以不能发放糖果
     */
    override fun dispense() {
        println("You need to pay first")
    }
}