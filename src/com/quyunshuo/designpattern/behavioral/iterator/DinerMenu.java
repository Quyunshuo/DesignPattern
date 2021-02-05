package com.quyunshuo.designpattern.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * 餐厅菜单
 * 餐厅的菜单采用的是数组进行维护
 */
public class DinerMenu implements Menu {

    static final int MAX_ITEMS = 6;

    private int numberOfItems = 0;

    /**
     * 餐厅菜单使用的是数组，所以可以控制菜单的长度
     */
    private final MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese",
                false, 3.05);
        addItem("Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice", true, 3.99);
        addItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89);
    }

    /**
     * 添加元素 创建一个MenuItem添加进数组内 并且会检查数组是否超出了它的长度控制
     *
     * @param name        String 名称
     * @param description String 描述
     * @param vegetarian  boolean 是否为素食
     * @param price       double 单价
     */
    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    /**
     * 返回数组
     */
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    /**
     * 这里使用Java 8 的Stream操作数组，返回一个迭代器
     */
    public Iterator<MenuItem> createIterator() {
        return Arrays.stream(menuItems).iterator();
    }

    // other menu methods here
    // 同煎饼屋一样 这里还有很多其他的菜单代码依赖于这个菜单数组，所以厨师也不想重写那么多代码，不想更换数据结构
}