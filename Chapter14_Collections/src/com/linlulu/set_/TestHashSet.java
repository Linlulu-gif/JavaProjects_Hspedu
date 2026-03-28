package com.linlulu.set_;

import org.junit.Test;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 林露露
 * @version 1.0
 * HashSet的底层实现是  HashMap
 * 而：HashMap的底层原理： table(数组--16--》64) + 链表--8  ——》红黑树
 * HashSet不能存放同一个对象
 * 1. hash值不能相同，程序员其实可以重写定义类的 hashCode方法，而hash值不完全等于 hashCode
 * 底层还是有 一个 对于 hashCode的算法操作；
 * 2. hash值相同，链表上 挂着 equals不同的对象，若是
 * 3. hash值一样，equals也相等，那么对于HashMap而言 就是同一个对象（元素），只存放一次
 */
public class TestHashSet {
    public static void main(String[] args) {
        Employee employee1 = new Employee("张三", 29);
        Employee employee2 = new Employee("张三", 19);
        Employee employee3 = new Employee("张三", 29);

        HashSet hashSet = new HashSet();
        hashSet.add(employee1);
        hashSet.add(employee2);
        hashSet.add(employee3);
        System.out.println(hashSet);
        //[{name=张三 age=19}, {name=张三 age=29}]
    }
    @Test
    public void sum(){

    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
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

    @Override
    public boolean equals(Object o) {//关系着是否挂载在同一个hash值计算的table位置
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                name.equals(employee.name);
    }

    @Override
    public int hashCode() {//关系着hash值
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "{name=" + name + " age="+ age + "}";
    }
}
