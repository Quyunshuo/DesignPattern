package com.quyunshuo.designpattern.structural.composite

/**
 * 测试组合模式
 */
fun main() {

    // 二级菜单
    val pancakeHouseMenu: MenuComponent = Menu("PANCAKE HOUSE MENU", "Breakfast")
    val dinerMenu: MenuComponent = Menu("DINER MENU", "Lunch")
    val cafeMenu: MenuComponent = Menu("CAFE MENU", "Dinner")

    // 顶层菜单
    val allMenus: MenuComponent = Menu("ALL MENUS", "All menus combined")
    allMenus.add(pancakeHouseMenu)
    allMenus.add(dinerMenu)
    allMenus.add(cafeMenu)

    // 二级菜单的菜单项
    pancakeHouseMenu.add(
        MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99)
    )
    pancakeHouseMenu.add(
        MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99)
    )
    pancakeHouseMenu.add(
        MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries and blueberry syrup", true, 3.49)
    )
    pancakeHouseMenu.add(
        MenuItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59)
    )

    dinerMenu.add(
        MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99)
    )
    dinerMenu.add(
        MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99)
    )
    dinerMenu.add(
        MenuItem("Soup of the day", "A bowl of the soup of the day, with a side of potato salad", false, 3.29)
    )
    dinerMenu.add(
        MenuItem("Hot Dog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05)
    )
    dinerMenu.add(
        MenuItem("Steamed Veggies and Brown Rice", "A medly of steamed vegetables over brown rice", true, 3.99)
    )

    dinerMenu.add(
        MenuItem("Pasta", "Spaghetti with marinara sauce, and a slice of sourdough bread", true, 3.89)
    )

    // 三级菜单
    val dessertMenu: MenuComponent = Menu("DESSERT MENU", "Dessert of course!")
    dinerMenu.add(dessertMenu)
    dessertMenu.add(
        MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59)
    )
    dessertMenu.add(
        MenuItem("Cheesecake", "Creamy New York cheesecake, with a chocolate graham crust", true, 1.99)
    )
    dessertMenu.add(
        MenuItem("Sorbet", "A scoop of raspberry and a scoop of lime", true, 1.89)
    )

    cafeMenu.add(
        MenuItem(
            "Veggie Burger and Air Fries",
            "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
            true,
            3.99
        )
    )
    cafeMenu.add(
        MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69)
    )
    cafeMenu.add(
        MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29)
    )

    // 女招待
    val waitress = Waitress(allMenus)
    waitress.printMenu()

    // 输出结果
    // ALL MENUS, All menus combined
    // ------------------------
    //
    // PANCAKE HOUSE MENU, Breakfast
    // ------------------------
    //   K&B's Pancake Breakfast(v), 2.99
    //     -- Pancakes with scrambled eggs and toast
    //   Regular Pancake Breakfast, 2.99
    //     -- Pancakes with fried eggs, sausage
    //   Blueberry Pancakes(v), 3.49
    //     -- Pancakes made with fresh blueberries and blueberry syrup
    //   Waffles(v), 3.59
    //     -- Waffles with your choice of blueberries or strawberries
    //
    // DINER MENU, Lunch
    // ------------------------
    //   Vegetarian BLT(v), 2.99
    //     -- (Fakin') Bacon with lettuce & tomato on whole wheat
    //   BLT, 2.99
    //     -- Bacon with lettuce & tomato on whole wheat
    //   Soup of the day, 3.29
    //     -- A bowl of the soup of the day, with a side of potato salad
    //   Hot Dog, 3.05
    //     -- A hot dog, with saurkraut, relish, onions, topped with cheese
    //   Steamed Veggies and Brown Rice(v), 3.99
    //     -- A medly of steamed vegetables over brown rice
    //   Pasta(v), 3.89
    //     -- Spaghetti with marinara sauce, and a slice of sourdough bread
    //
    // DESSERT MENU, Dessert of course!
    // ------------------------
    //   Apple Pie(v), 1.59
    //     -- Apple pie with a flakey crust, topped with vanilla icecream
    //   Cheesecake(v), 1.99
    //     -- Creamy New York cheesecake, with a chocolate graham crust
    //   Sorbet(v), 1.89
    //     -- A scoop of raspberry and a scoop of lime
    //
    // CAFE MENU, Dinner
    // ------------------------
    //   Veggie Burger and Air Fries(v), 3.99
    //     -- Veggie burger on a whole wheat bun, lettuce, tomato, and fries
    //   Soup of the day, 3.69
    //     -- A cup of the soup of the day, with a side salad
    //   Burrito(v), 4.29
    //     -- A large burrito, with whole pinto beans, salsa, guacamole
}