package com.linlulu.homework.homework_13;

public class Student extends Person{
    //属性

    private String stu_id;//学号

    //方法
    public Student(String name, char sex, int age, String stu_id) {
       super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println(super.getName() + "承诺，我会好好学习java----------");
    }

    @Override
    public String play() {
        return (super.play() + "足球***********");
    }

    public void printInfo(){
        System.out.println("学生的信息：" + basicInfo());
        study();
        System.out.println(play());;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}' + super.toString();
    }
}
