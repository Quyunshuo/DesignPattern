package com.quyunshuo.designpattern.behavioral.iterator

/**
 * 两位餐厅的厨师都同意实现这个类
 *
 * @property name String 名称
 * @property description String 叙述
 * @property vegetarian Boolean 是否为素菜
 * @property price Double 价格
 * @constructor
 */
class MenuItem constructor(val name: String, val description: String, val vegetarian: Boolean, val price: Double)