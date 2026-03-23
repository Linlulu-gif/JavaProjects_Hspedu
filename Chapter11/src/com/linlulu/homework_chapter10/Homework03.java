package com.linlulu.homework_chapter10;

/**
 * @author 林露露
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.shout();//
        animal = new Dog();
        animal.shout();
    }
}

abstract class Animal{
    public abstract void shout();
}

class Cat extends Animal{

    @Override
    public void shout() {
        System.out.println("猫会喵喵叫。。。。。。。。");
    }
}

class Dog extends Animal{

    @Override
    public void shout() {
        System.out.println("狗会汪汪叫。。。。。。。。。。。。");
    }
}


