package com.linlulu.map_.hashmap;

import java.util.*;

/**
 * @author 林露露
 * @version 1.0
 * 在这里演示 hashmap的两种 遍历方式
 *
 * 1.方式 1
 * a.先拿到所有key
 * b.拿到key之后遍历hashmap(比如：增强for)
 */
@SuppressWarnings("all")
public class HashMapIterator {
    public static void main(String[] args) {
        //输出年龄 大于 32 的员工信息
        //1.将对象到hashmap中
        Map hashMap = new HashMap();
        hashMap.put(1,new Employee("张三", 29, 1));
        hashMap.put(2,new Employee("李四",33,2));
        hashMap.put(3,new Employee("王虎",24,3));
        hashMap.put(4,new Employee("小桂子",49,4));
        hashMap.put(5,new Employee("刘二娃",39,5));
        hashMap.put(6,new Employee("李承",19,6));

        //2.遍历hashmap
        //方式一：先得到keyset，再遍历keyset,拿到key,就可以在map中.get(key)拿到value
//        Set keySet = hashMap.keySet();
//        for (Object key : keySet) {
//            Employee employee = (Employee)hashMap.get(key);//取出的对象需要
//            //向下转型
//            if(employee.getAge() > 32){
//                System.out.println(employee);
//            }
//        }
//        //方式二：拿到Map.entrySet
        Set set = hashMap.entrySet();//里面放了一个个Entry对象节点，Entry对象是HashMap的内部类对象
        //Entry封装了key-value
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();//得到的是一个Entry node
            Employee employee = (Employee) entry.getValue();//拿到value值
            if(employee.getAge() > 32){
                System.out.println(employee);
            }
        }
    }
}

@SuppressWarnings("all")
class Employee{
    private String name;
    private int age;
    private int id;//员工id

    public Employee(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
