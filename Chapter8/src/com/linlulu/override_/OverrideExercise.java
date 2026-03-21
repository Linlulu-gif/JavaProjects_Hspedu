package com.linlulu.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("林露露",19);
        String s1 = person.say();
        System.out.println("s1的信息\n" + s1);

        Student student = new Student("汪梦丽",21,20181102,98.5);
        String s2 = student.say();
        System.out.println("s2的信息\n" + s2);
    }

}
