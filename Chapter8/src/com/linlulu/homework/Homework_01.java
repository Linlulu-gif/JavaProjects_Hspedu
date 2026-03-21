package com.linlulu.homework;


import java.util.Scanner;

/**
 * 定义一个Person{name,age,job},初始化 Person对象数组，有5个对象
 * 按照age的大小进行排序，提示 使用 冒泡排序
 */

public class Homework_01 {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        int age = 0;
        String name;
        String job;
        Scanner scanner = new Scanner(System.in);

        //初始化
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
            System.out.println("请输入 people[" + i + "]的name,age和job:");
            name = scanner.next();
            age = scanner.nextInt();
            job = scanner.next();
            people[i].setAge(age);
            people[i].setName(name);
            people[i].setJob(job);
        }
        //打印排序前 people 内 各个元素的值
        System.out.println("******************排序前********************");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);//Person类重写了toString方法
        }

        //使用冒泡排序对Person 数组进行元素排序，按照age从小到大、
        Person temp_person;
        int count = 0;//计数器，用于统计每一轮排序比较的次数
        for (int i = 0; i < people.length - 1; i++) { //排序轮数
            for (int j = 0; j < people.length - 1 - i; j++) {//第i轮排序内比较的次数
                if (people[j].getAge() > people[j + 1].getAge()) {
                    temp_person = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp_person;
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Person数组已经有序！！！");
                break;
            }
            count = 0;//置零
        }

        //打印排序后 people 内 各个元素的值
        System.out.println("******************排序后********************");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);//Person类重写了toString方法
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
