package com.quyunshuo.designpattern.behavioral.state

/**
 * 糖果机
 * @property count Int 糖果的数量
 */
class GumballMachine(var count: Int) {

    /**
     * 售罄状态
     */
    val mSoldOutState: State by lazy { SoldOutState(this) }

    /**
     * 没有25美分状态
     */
    val mNoQuarterState: State by lazy { NoQuarterState(this) }

    /**
     * 有25美分状态
     */
    val mHasQuarterState: State by lazy { HasQuarterState(this) }

    /**
     * 售出状态
     */
    val mSoldState: State by lazy { SoldState(this) }

    /**
     * 赢家状态
     */
    val mWinnerState: State by lazy { WinnerState(this) }

    /**
     * 初始状态为售罄
     */
    private var mState: State = mSoldOutState

    init {
        // 如果初始值大于0 就将状态改为 NoQuarterState
        if (count > 0) {
            mState = mNoQuarterState
        }
    }

    fun insertQuarter() {
        mState.insertQuarter()
    }


    fun ejectQuarter() {
        mState.ejectQuarter()
    }

    fun turnCrank() {
        mState.turnCrank()
        mState.dispense()
    }

    // 请注意 我们不需要在GumballMachine内准备一个dispense()方法，因为这只是一个内部动作，用户不可以直接要求机器发放糖果
    // 但我们是在turnCrank()方法中调用dispense()方法的
//    fun dispense() {}

    /**
     * 这个方法允许其他的对象（像我们的状态对象）将机器的状态转换到不同的状态
     * @param state State
     */
    fun setState(state: State) {
        mState = state
    }

    /**
     * 这个糖果机提供了一个releaseBall()辅助方法来释放糖果，并将count实例变量的值减一
     */
    fun releaseBall() {
        println("A gumball comes rolling out the slot...")
        if (count != 0) {
            count -= 1
        }
    }

    // 这里是像toString()和refill()的其他方法
}