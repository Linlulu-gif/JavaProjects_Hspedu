package com.linlulu.polymorphic_.poly_01;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    //未使用多态前代码, feed方法被多次实现，构成代码冗余；不利于后期代码维护
//    //feed 小狗
//    public void feed(Dog dog,Bone bone){
//        System.out.println(name + "喂" + dog.getAnimalName() + bone.getFoodName());
//    }
//    //feed 小猫
//    public void feed(Cat cat,Fish fish){
//        System.out.println(name + "喂" + cat.getAnimalName() + fish.getFoodName());
//    }
    /*
    使用对象的多态实现
    */
    public void feed(Animals animals,Food food){
        System.out.println("主人" + name + "喂" + animals.getAnimalName() + food.getFoodName());
    }
}
