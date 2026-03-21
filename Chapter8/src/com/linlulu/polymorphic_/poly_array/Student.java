package com.linlulu.polymorphic_.poly_array;

public class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //特有方法study()
    public void study() {
        System.out.println(super.getName() + "正在学习******");
    }

    //override 父类Person的say()方法
    @Override
    public void say() {
        System.out.println("学生  " + "name = " + super.getName() +
                ",age = " + super.getAge() + ", score = " + getScore());
    }
}
