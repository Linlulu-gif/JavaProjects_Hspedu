package com.linlulu.homework.homework_05;

public class Scientist extends Employee{//科学家 子类
    private double bonus;//年终奖金

    public Scientist(String name, double basicSal, int work_months) {
        super(name, basicSal, work_months);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double yearSal() {
        return (super.yearSal() + bonus);//科学家的年工资计算也要重写
    }
}
