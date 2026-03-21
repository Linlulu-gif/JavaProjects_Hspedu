package com.linlulu.homework.homework_05;

public class Employee {
    private String name;//姓名
    private double basicSal;//基本工资，按月
    private int work_months;//带薪月数

    public Employee(String name, double basicSal, int work_months) {
        this.name = name;
        this.basicSal = basicSal;
        this.work_months = work_months;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSal() {
        return basicSal;
    }

    public void setBasicSal(double basicSal) {
        this.basicSal = basicSal;
    }

    public int getWork_months() {
        return work_months;
    }

    public void setWork_months(int work_months) {
        this.work_months = work_months;
    }

    //获得全年工资
    public double yearSal(){
        //计算年工资
        return (basicSal * work_months);// 月工资 * 带薪月数
    }
}
