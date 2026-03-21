package com.linlulu.polymorphic_.poly_array;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //say()方法介绍自己
    public void say(){
        System.out.println("我的 name = " + getName() + ",age = "  + getAge());
    }
}
