package com.quyunshuo.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 煎饼屋菜单
 * 煎饼屋的菜单使用的是ArrayList进行维护
 */
public class PancakeHouseMenu implements Menu {

    private final ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        // 煎饼屋使用一个ArrayList存储他的菜单项
        menuItems = new ArrayList<>();

        // 在菜单的构造器中，每一个菜单项都会被加入到ArrayList中
        // 每一个菜单项都有一个名称、一个叙述、是否为素食，还有价格
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries and blueberry syrup",
                true,
                3.49);

        addItem("Waffles",
                "Waffles with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    /**
     * 添加菜单项
     *
     * @param name        String 名称
     * @param description String 描述
     * @param vegetarian  boolean 是否为素食
     * @param price       double 单价
     */
    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    /**
     * 返回菜单列表
     */
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    /**
     * 创建迭代器，由于ArrayList拥有自己的迭代器 所以直接返回ArrayList的迭代器
     *
     * @return
     */
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }

    // other menu methods here
    // 其他的菜单代码都依赖于ArrayList，所以他不希望重写全部的答案
}