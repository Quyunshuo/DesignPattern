package com.quyunshuo.designpattern.creational.factory.method

/**
 * 纽约风味的芝士比萨
 */
class NYStyleCheesePizza : Pizza() {

    init {
        // 纽约比萨有自己的大蒜番茄酱和薄饼
        name = " NY style Sauce and Cheese Pizza "
        dough = " Thin Crust Dough "
        sauce = " Marinara Sauce "

        // 上面覆盖的是意大利reggiano高级干酪
        toppings.add("Grated Reggiano Cheese")
    }
}