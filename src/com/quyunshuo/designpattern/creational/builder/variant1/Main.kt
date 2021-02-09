package com.quyunshuo.designpattern.creational.builder.variant1

/**
 * 测试变种Builder模式
 */
fun main() {
    val user1 = User.Builder("Yunshuo", "Qu")
        .age(22)
        .gender("男")
        .phoneNo("10086")
        .builder()

    val user2 = User.Builder("小红", "张")
        .age(18)
        .gender("女")
        .builder()
    println(user1.toString())
    println(user2.toString())
    // 输出结果
    // User{mFirstName='Yunshuo', mLastName='Qu', mGender='男', mAge=22, mPhoneNo='10086'}
    // User{mFirstName='小红', mLastName='张', mGender='女', mAge=18, mPhoneNo='null'}
}