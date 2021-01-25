package com.quyunshuo.designpattern.behavioral.command

/**
 * 打开吊扇中速的命令
 */
class CeilingFanMediumCommand(private val ceilingFan: CeilingFan) : Command {

    /**
     * 增加局部状态以便追踪吊扇之前的速度
     */
    private var prevSpeed = 0

    override fun execute() {
        // 改变风扇的速度之前需要先将它之前的状态记录起来，以便撤销时使用
        prevSpeed = ceilingFan.getSpeed()
        ceilingFan.medium()
    }

    override fun undo() {
        when (prevSpeed) {
            CeilingFan.OFF -> ceilingFan.off()
            CeilingFan.LOW -> ceilingFan.low()
            CeilingFan.MEDIUM -> ceilingFan.medium()
            CeilingFan.HIGH -> ceilingFan.high()
        }
    }
}