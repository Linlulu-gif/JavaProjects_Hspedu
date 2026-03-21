package com.linlulu.polymorphic_.poly_parameter;

//经理
public class Manager extends Employee {
    private double bonus;//奖金

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }

    public void manage() {
        System.out.println("经理" + super.getName() + "正在管理员工------------");
    }
}
