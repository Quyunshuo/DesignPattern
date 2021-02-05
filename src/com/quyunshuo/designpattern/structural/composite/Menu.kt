package com.quyunshuo.designpattern.structural.composite

/**
 * 组合类 - 菜单
 * 菜单和菜单项一样，都扩展自[MenuComponent]
 */
class Menu(private val menuName: String, private val menuDescription: String) : MenuComponent() {

    /**
     * 菜单可以有任意数的孩子，这些孩子必须属于[MenuComponent]类型，我们使用ArrayList记录它们
     */
    private val menuComponents = ArrayList<MenuComponent>()

    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponent.remove(menuComponent)
    }

    override fun getChild(i: Int): MenuComponent = menuComponents[i]

    override fun getName(): String = menuName

    override fun getDescription(): String = menuDescription

    /**
     * 该方法不仅打印出菜单本身的信息，也打印出菜单内所有组件的内容：其他菜单和菜单项
     */
    override fun print() {
        print("\n${getName()}")
        println(", ${getDescription()}")
        println("------------------------")

        // 使用迭代器遍历所有菜单组件
        val iterator = menuComponents.iterator()
        while (iterator.hasNext()) {
            val menuComponent = iterator.next()
            menuComponent.print()
        }
    }
}