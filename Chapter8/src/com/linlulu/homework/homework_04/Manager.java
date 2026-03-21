package com.linlulu.homework.homework_04;

public class Manager extends Employee{//经理类----子类
    private double bonus = 10000;//默认奖金是10000

    public Manager(String name, double day_sal, int work_days, double level) {
        super(name, day_sal, work_days, level);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.print("经理 ");
        super.printSal();//代码复用
        System.out.print((bonus + getDay_sal()*getWork_days()*getLevel()) + "元");
    }
}
