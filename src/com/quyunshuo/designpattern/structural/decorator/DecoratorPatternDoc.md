# 装饰者模式 - Decorator Pattern

## 概念

装饰者模式动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案

## 案例

* 星巴兹咖啡应用 - 《Head First 设计模式》  
  星巴兹咖啡店是一家专注做咖啡的门店，里面有各式各样的咖啡以及调料

* Java I/O - JDK  
  java.io包内的I/O相关类使用了装饰者模式

## 知识点

* 利用继承设计子类的行为，是在编译时静态决定的，而且所有的子类都会继承到相同的行为。然而，如果能够利用组合的做法扩展对象的行为，就可以在运行时动态的进行扩展
* 通过动态地组合对象，可以写新的代码添加新功能，而无须修改现有代码。既然没有改变现有代码，那么引进bug或产生意外副作用的机会将大幅度减少
* 装饰者和被装饰对象拥有相同地超类型
* 可以用一个或多个装饰者包装一个对象
* 既然装饰者和被装饰对象有相同的超类型，所以在任何需要原始对象（被包装的）的场合，可以用装饰过的对象代替它
* 装饰者可以在所委托被装饰者的行为之前与/或之后，加上自己的行为，以达到特定的目的
* 继承Beverage抽象类，是为了有正确的类型，而不是继承它的行为。行为来自装饰者和基础组件，或与其他装饰者之间的组合关系
* 通常装饰者模式是采用抽象类，但在Java中可以使用接口
* Java I/O 也引出装饰者模式的一个"缺点"：利用装饰者模式，常常造成设计中有大量的小类，数量实在太多，可能会造成使用此API程序员的困扰
* 采用装饰者在实例化组件时，将增加代码的复杂度，一旦使用装饰者模式，不只需要实例化组件，还要把此组件包装进装饰者中
* 继承属于扩展形式之一，但不见得是达到弹性设计的最佳方式
* 组合和委托可用于在运行时动态地加上新的行为