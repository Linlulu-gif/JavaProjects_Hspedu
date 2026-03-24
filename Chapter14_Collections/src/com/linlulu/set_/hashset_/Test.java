package com.linlulu.set_.hashset_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 林露露
 * @version 1.0
 */
@SuppressWarnings("all")
public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("林露露", 150000, new MyDate(2000, 2, 27));
        Employee employee2 = new Employee("张三", 150000, new MyDate(2000, 2, 27));
        Employee employee3 = new Employee("林露露", 150000, new MyDate(2000, 2, 27));
        Employee employee4 = new Employee("林露露", 150000, new MyDate(2000, 9, 1));

        Set set = new HashSet();
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }
    }
}
