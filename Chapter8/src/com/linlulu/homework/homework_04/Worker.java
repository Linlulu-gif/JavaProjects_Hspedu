package com.linlulu.homework.homework_04;

public class Worker extends Employee{//普通工人-----子类

    public Worker(String name, double day_sal, int work_days, double level) {
        super(name, day_sal, work_days, level);
    }

    @Override
    public void printSal() {
        System.out.print("普通员工");
        super.printSal();
        System.out.print((getDay_sal()*getWork_days()*getLevel()) + "元");
    }
}
