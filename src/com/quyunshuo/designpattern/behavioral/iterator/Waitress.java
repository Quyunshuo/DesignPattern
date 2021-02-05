package com.quyunshuo.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 女招待
 */
public class Waitress {

    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<?> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            // 使用菜单项获取到对应菜单的迭代器
            printMenu(menu.createIterator());
        }
    }

    /**
     * 使用迭代器打印输出元素
     *
     * @param iterator 菜单项的迭代器
     */
    void printMenu(Iterator<?> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}