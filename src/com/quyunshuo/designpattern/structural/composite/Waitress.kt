package com.quyunshuo.designpattern.structural.composite

/**
 * 女招待 - 菜单的主要客户
 */
class Waitress(private val allMenus: MenuComponent) {

    /**
     * 女招待只需要调用最顶层菜单的print()，就可以打印整个菜单层次，包括所有菜单和菜单项
     */
    fun printMenu() {
        allMenus.print()
    }
}