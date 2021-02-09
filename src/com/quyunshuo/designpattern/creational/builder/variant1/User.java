package com.quyunshuo.designpattern.creational.builder.variant1;

public class User {

    private final String mFirstName;// 名字 必选

    private final String mLastName; // 姓氏 必选

    private final String mGender;   // 性别 可选

    private final int mAge;         // 年龄 可选

    private final String mPhoneNo;  // 电话 可选

    private User(Builder builder) {
        this.mFirstName = builder.firstName;
        this.mLastName = builder.lastName;
        this.mGender = builder.gender;
        this.mAge = builder.age;
        this.mPhoneNo = builder.phoneNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "mFirstName='" + mFirstName + '\'' +
                ", mLastName='" + mLastName + '\'' +
                ", mGender='" + mGender + '\'' +
                ", mAge=" + mAge +
                ", mPhoneNo='" + mPhoneNo + '\'' +
                '}';
    }

    public static class Builder {

        private final String firstName;// 名字 必选

        private final String lastName; // 姓氏 必选

        private String gender;         // 性别 可选

        private int age;               // 年龄 可选

        private String phoneNo;        // 电话 可选


        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public User builder() {
            return new User(this);
        }
    }
}