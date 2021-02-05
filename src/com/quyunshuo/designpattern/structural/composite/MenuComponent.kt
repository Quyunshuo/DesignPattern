package com.quyunshuo.designpattern.structural.composite

/**
 * 组件
 * 菜单组件这个角色是为叶节点和组合节点提供一个共同的接口
 * 所有的组件都必须实现该接口；然而，叶节点和组合节点的角色不同，所以有些方法可能并不适合某种节点。面对这种情况，有时候最好是抛出运行时异常
 * 因为有些方法只对菜单项有意义，而有些方法只对菜单有意义，默认实现是抛出[UnsupportedOperationException]异常。
 * 这样，如果菜单项或菜单不支持某个操作，他们就不需要做任何事情，直接继承默认实现就可以了
 */
abstract class MenuComponent {

    /* 组合相关方法 */

    open fun add(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun remove(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun getChild(i: Int): MenuComponent {
        throw UnsupportedOperationException()
    }


    /* 这些方法是"操作"方法，它们被菜单项使用 */

    open fun getName(): String {
        throw UnsupportedOperationException()
    }

    open fun getDescription(): String {
        throw UnsupportedOperationException()
    }

    open fun getPrice(): Double {
        throw UnsupportedOperationException()
    }

    open fun isVegetarian(): Boolean {
        throw UnsupportedOperationException()
    }

    /* print是"操作"方法，这个方法被菜单项和菜单同时使用 */

    open fun print() {
        throw UnsupportedOperationException()
    }
}