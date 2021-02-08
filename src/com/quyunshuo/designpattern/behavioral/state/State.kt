package com.quyunshuo.designpattern.behavioral.state

/**
 * 状态接口
 * 所有的状态都必须实现这个接口
 */
interface State {

    /**
     * 放入25美分
     */
    fun insertQuarter()

    /**
     * 退回25美分
     */
    fun ejectQuarter()

    /**
     * 转曲柄
     */
    fun turnCrank()

    /**
     * 发放糖果
     */
    fun dispense()
}