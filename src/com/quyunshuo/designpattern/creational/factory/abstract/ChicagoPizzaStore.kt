package com.quyunshuo.designpattern.creational.factory.abstract

/**
 * 能够产生产品的类成为具体创建者
 * 芝加哥比萨店 加盟自对象村的比萨店
 */
class ChicagoPizzaStore : PizzaStore() {

    /**
     * 这就是创建具体类的地方。对于每一种比萨类型，都是创建芝加哥风味。
     * 注意 超类的createPizza()方法并不知道正在创建哪一种比萨类型，它只知道这个比萨可以被准备、被烘烤、被切片、被装盒
     */
    override fun createPizza(pizzaType: String): Pizza? {
        return when (pizzaType) {
            "cheese" -> {
                // 芝加哥店会用到芝加哥比萨原料工厂
                // 由该原料工厂生产所有芝加哥风味比萨所需要的原料
                val chicagoPizzaIngredientFactory = ChicagoPizzaIngredientFactory()
                // 把工厂传递给每一个比萨，以便比萨能从工厂中获取原料
                CheesePizza(chicagoPizzaIngredientFactory).apply {
                    name = " Chicago Style Cheese Pizza "
                }
            }
            else -> null
        }
    }
}