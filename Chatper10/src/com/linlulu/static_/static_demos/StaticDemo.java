package com.linlulu.static_.static_demos;

/**
 * 演示使用 类变量 和 类方法
 */
public class StaticDemo {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 17);
        Student.payFee(2000);//类名.方法名
        Student student2 = new Student("Alice", 18);
        Student.payFee(3000);
        Student student3 = new Student("Bob", 17);
        Student.payFee(2000);
        Student student4 = new Student("王五", 19);
        Student.payFee(5000);

        Student.showFee();
    }
}


class Student {
    //属性
    private String name;
    private int age;
    //类变量-----学费
    private static double fee = 0;

    public Student(String name, int age) {
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

    public static double getFee() {
        return fee;
    }

    public static void setFee(double fee) {
        Student.fee = fee;
    }

    //类方法 payFee()交学费；showFee()展示学费情况
    public static void payFee(double stu_fee) {
        fee += stu_fee;
    }

    public static void showFee() {
        System.out.println("目前总共缴纳的学费：" + fee);
    }
}