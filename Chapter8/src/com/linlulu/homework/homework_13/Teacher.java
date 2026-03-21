package com.linlulu.homework.homework_13;

public class Teacher extends Person{
    //属性

    private int work_age;//工龄

    //方法

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println(super.getName() + "承诺，我一定认真教好java-------------");
    }

    @Override
    public String play() {
        return (super.play() + "象棋***********");
    }

    public void printInfo(){
        System.out.println("教师的信息：" + basicInfo());
        teach();
        System.out.println(play());;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }
}
