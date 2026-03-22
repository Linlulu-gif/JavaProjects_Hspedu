package com.linlulu.abstract_;

//在这里我们演示实现   抽象类 和抽象方法
public class AbstractTest {
    public static void main(String[] args) {
        Student student = new Student("林露露", '男', 27, "20181104");
//        Person person = new Person();//报错
    }
}

/**
 * 抽象类  本质 还是类   ，只是不能被实例化
 * 可以包含类的所有内容，也可以没有  abstract methods
 */
abstract class Person{
    //属性
    private String name;
    private char gender;
    private int age;

    //方法

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    abstract public void work();//声明抽象方法
}

class Student extends Person{
    //学生类
    //属性
    private String stu_id;//学号

    public Student(String name, char gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}' + super.toString();
    }

    public void work(){
        System.out.println("学生" + getName() + "正在学习************");
    }
}