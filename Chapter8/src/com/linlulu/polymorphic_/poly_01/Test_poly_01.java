package com.linlulu.polymorphic_.poly_01;

public class Test_poly_01 {
    public static void main(String[] args) {
        Master master = new Master("林露露");
        Dog dog = new Dog("小花");
        Bone bone = new Bone("排骨");
        master.feed(dog, bone);

        Cat cat = new Cat("tom");
        Fish fish = new Fish("鲤鱼");
        master.feed(cat, fish);
    }
}
