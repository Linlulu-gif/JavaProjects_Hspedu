package com.linlulu.generic_;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author 林露露
 * @version 1.0
 * 演示 泛型编程 和 Comparable 接口 在 实际开发中 类 的 应用
 */
public class TestGeneric_ {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Smith",20000,new MyDate(2012,12,12)));
        employees.add(new Employee("Alice",10000,new MyDate(2010,9,27)));
        employees.add(new Employee("Alice",40000,new MyDate(2010,12,12)));

        System.out.println("************************排序前*********************");
        System.out.println(employees);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                int res = emp1.getName().compareTo(emp2.getName());//先得到名字的比较结果
                if(res != 0){
                    return res;//名字不相同，直接返回结果
                }
                //那就将生日的比较结果作为排序的规则
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });
        System.out.println("************************排序后*********************");
        System.out.println(employees);
    }
}
