package com.quyunshuo.designpattern.structural.facade

/**
 * 测试家庭影院观赏电影（用轻松的方式）
 */
fun main() {
    // 我们在测试中，直接建立这些组件，正常的情况下，某个外观会被指派给客户使用，而不需要由客户自定创建外观
    val amp = Amplifier()
    val cd = CdPlayer()
    val dvd = DvdPlayer()
    val popcornPopper = PopcornPopper()
    val projector = Projector()
    val screen = Screen()
    val lights = TheaterLights()
    val tuner = Tuner()

    val homeTheaterFacade = HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popcornPopper)
    homeTheaterFacade.watchMovie("功夫熊猫")
    homeTheaterFacade.endMovie()

    // 输出结果
    // Get ready to watch a movie 功夫熊猫...
    // PopcornPopper -> on
    // PopcornPopper -> pop
    // TheaterLights -> dim
    // Screen -> down
    // Projector -> on
    // Projector -> wideScreenMode
    // Amplifier -> on
    // Amplifier -> setDvd
    // Amplifier -> setSurroundSound
    // Amplifier -> setVolume 5
    // DvdPlayer -> on
    // DvdPlayer -> play
    // Shutting movie theater down...
    // PopcornPopper -> off
    // TheaterLights -> on
    // Screen -> up
    // Projector -> off
    // Amplifier -> off
    // DvdPlayer -> stop
    // DvdPlayer -> eject
    // DvdPlayer -> off
}