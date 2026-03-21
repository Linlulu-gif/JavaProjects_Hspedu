package com.linlulu.homework.homework_04;

public class Homework_04 {
    public static void main(String[] args) {
        Employee employee_1 = new Manager("Smith",220,300,1.2);
        ((Manager) employee_1).setBonus(25000);//向下转型
        employee_1.printSal();
        System.out.println("\n=================================================");
        employee_1 = new Worker("Alice",150,340,1.0);
        employee_1.printSal();
    }
}
