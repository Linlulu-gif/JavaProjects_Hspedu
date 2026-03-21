package com.linlulu.homework;

public class Homework_03 {
    public static void main(String[] args) {
        //定义并初始化一个教师对象
        //向上转型，多态
        Teacher teacher = new Professor("张三",35,"教授",28000);
        System.out.println(teacher.getClass());
        teacher.introduce();

    }
}
