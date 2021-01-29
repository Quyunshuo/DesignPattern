package com.quyunshuo.designpattern.structural.facade

/**
 * 家庭影院外观
 *
 * @constructor 将所有的家庭影院设备或物品组合进外观类
 */
class HomeTheaterFacade constructor(
    private val amp: Amplifier,
    private val tuner: Tuner,
    private val dvd: DvdPlayer,
    private val cd: CdPlayer,
    private val projector: Projector,
    private val screen: Screen,
    private val lights: TheaterLights,
    private val popper: PopcornPopper
) {

    /**
     * 将子系统的组件整合成一个统一的接口
     * watchMovie将我们之前手动进行的每项任务依次处理。请注意，每项任务都是委托子系统中相应的组件处理的
     * @param movie String
     */
    fun watchMovie(movie: String) {
        println("Get ready to watch a movie $movie...")
        popper.on()
        popper.pop()
        lights.dim()
        screen.down()
        projector.on()
        projector.wideScreenMode()
        amp.on()
        amp.setDvd()
        amp.setSurroundSound()
        amp.setVolume(5)
        dvd.on()
        dvd.play()
    }

    /**
     * endMovie负责关闭一切，每项任务也都是委托子系统中合适的组件处理的
     */
    fun endMovie() {
        println("Shutting movie theater down...")
        popper.off()
        lights.on()
        screen.up()
        projector.off()
        amp.off()
        dvd.stop()
        dvd.eject()
        dvd.off()
    }
}