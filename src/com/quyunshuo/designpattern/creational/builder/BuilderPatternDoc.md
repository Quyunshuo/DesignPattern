# 建造者模式 - Builder Pattern

## 概念

建造者模式将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示

## 案例

* 经典的Builder模式 - 《Android高级进阶》
* 变种的Builder模式（Java）

## 知识点

* 经典的Builder模式主要有四个参与者
    * Product：被构造的复杂对象，ConcreteBuilder用来创建该对象的内部表示，并定义它的装配过程
    * Builder：抽象接口，用来定义创建Product对象的各个组成部件的操作
    * ConcreteBuilder：Builder接口的具体实现，可以定义多个，是实际构建Product对象的地方，同时会提供一个返回Product的接口
    * Director：Builder接口的构造者和使用者
* 经典的Builder模式重点在于抽象出对象创建的步骤，并通过调用不同的具体实现从而得到不同的结果
* 变种Builder模式的目的在于减少对象创建过程中引入的多个重载构造函数、可选参数以及setters过度使用导致的不必要的复杂性
