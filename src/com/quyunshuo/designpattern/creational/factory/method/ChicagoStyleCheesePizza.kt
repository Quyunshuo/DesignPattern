package com.quyunshuo.designpattern.creational.factory.method

/**
 * 芝加哥风味的芝士比萨
 */
class ChicagoStyleCheesePizza : Pizza() {

    init {
        // 芝加哥比萨使用小番茄酱作为酱料，并使用厚饼
        name = " Chicago Style Deep Dish Cheese Pizza "
        dough = " Extra Thick Crust Dough "
        sauce = " Plum Tomato Sauce "

        // 芝加哥风味的深盘比萨使用许多mozzarella（意大利白干酪）
        toppings.add("Shredded Mozzarella Cheese ")
    }

    /**
     * 这个芝加哥风味比萨覆盖了cut()方法，将比萨切成正方形
     */
    override fun cut() {
        println(" Cutting the pizza into square slices ")
    }
}