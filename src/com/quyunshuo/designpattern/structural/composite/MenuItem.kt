package com.quyunshuo.designpattern.structural.composite

/**
 * 菜单项，这是组合类图里的叶类，它实现组合内元素的行为
 * 扩展自组件[MenuComponent]
 */
class MenuItem(
    private val itemName: String,
    private val itemDescription: String,
    private val itemIsVegetarian: Boolean,
    private val itemPrice: Double
) : MenuComponent() {

    override fun getName(): String = itemName

    override fun getDescription(): String = itemDescription

    override fun getPrice(): Double = itemPrice

    override fun isVegetarian(): Boolean = itemIsVegetarian

    override fun print() {
        print("  $itemName")
        if (itemIsVegetarian) print("(v)")
        println(", ${getPrice()}")
        println("    -- ${getDescription()}")
    }
}