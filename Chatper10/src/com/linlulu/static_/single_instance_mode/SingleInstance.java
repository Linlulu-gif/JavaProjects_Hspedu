package com.linlulu.static_.single_instance_mode;

/**
 * 在这里演示 “单例设计模式” 的分类和使用方法
 * “单例”，即： 单个实例。 在实际开发中，我们的软件系统 可能从头至尾 就使用了 一个类的 一个对象，
 * 也就仅仅 同一个 对象，并且 类 也就提供了 唯一的 获取 这一 对象的 方法
 * 1. 分类（饿汉式  or 懒汉式）
 * 2.
 * （1）饿汉式：a.将构造方法私有化；b.在类内创建一个 私有 静态的类对象 = new 对象；3.提供 公共的 getInstance 静态方法
 * 方便后续获取这个静态对象    比如： java.lang包 内的 Runtime 类
 * 缺陷：在类加载时就创建对象，可能造成资源浪费
 * <p>
 * （2）懒汉式：a.将构造方法私有化；b.在类内创建一个 私有的 静态的类对象引用；3. 提供 公共的 getInstance 静态方法
 * 方便后续获取这个静态对象，先判断为 null 否（之前创建了吗？）再 返回 对象
 * <p>
 * 缺陷：可能造成多线程安全问题
 */
public class SingleInstance {
    public static void main(String[] args) {
        //调用  饿汉式  单例对象
        Student student1 = Student.getInstance();
        Student student2 = Student.getInstance();
        System.out.println("student1 == student2: " + (student1 == student2));

        Teacher teacher1 = Teacher.getInstance();
        Teacher teacher2 = Teacher.getInstance();
        System.out.println("teacher1 == teacher2: " + (teacher1 == teacher2));
    }
}


class Student {
    //属性
    private String name;
    //2.创建一个私有的静态的对象 new
    private static Student student = new Student("张三");//类加载时被创建

    //方法
    //1.私有化构造器

    private Student(String name) {
        this.name = name;
    }

    //3. 提供静态方法getInstance,可以唯一的获取instance
    public static Student getInstance() {
        return student;
    }
}

class Teacher {
    //属性
    private String name;
    private int age;

    //2.静态私有化一个该对象引用
    private static Teacher teacher;

    //1, 私有化构造方法
    private Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //3. 提供一个静态的公共接口，可以返回类对象
    public static Teacher getInstance() {
        if (teacher == null) {//若按是对象没有被创建，则创建
            teacher = new Teacher("林露露", 28);
        }
        return teacher;
    }
}
