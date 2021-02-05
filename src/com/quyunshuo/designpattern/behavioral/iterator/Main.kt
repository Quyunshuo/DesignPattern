package com.quyunshuo.designpattern.behavioral.iterator

import java.util.ArrayList

/**
 * 测试女招待-迭代器模式
 */
fun main() {
    // 煎饼屋菜单
    val pancakeHouseMenu = PancakeHouseMenu()
    // 餐厅菜单
    val dinerMenu = DinerMenu()
    // 将两个菜单聚合
    val menus = ArrayList<Menu>()
    menus.add(pancakeHouseMenu)
    menus.add(dinerMenu)
    // 女招待进行输出所有的菜单项
    val waitress = Waitress(menus)
    waitress.printMenu()
    // 输出结果
    // K&B's Pancake Breakfast, 2.99 -- Pancakes with scrambled eggs and toast
    // Regular Pancake Breakfast, 2.99 -- Pancakes with fried eggs, sausage
    // Blueberry Pancakes, 3.49 -- Pancakes made with fresh blueberries and blueberry syrup
    // Waffles, 3.59 -- Waffles with your choice of blueberries or strawberries
    // Vegetarian BLT, 2.99 -- (Fakin') Bacon with lettuce & tomato on whole wheat
    // BLT, 2.99 -- Bacon with lettuce & tomato on whole wheat
    // Soup of the day, 3.29 -- Soup of the day, with a side of potato salad
    // Hotdog, 3.05 -- A hot dog, with sauerkraut, relish, onions, topped with cheese
    // Steamed Veggies and Brown Rice, 3.99 -- Steamed vegetables over brown rice
    // Pasta, 3.89 -- Spaghetti with Marinara Sauce, and a slice of sourdough bread
}