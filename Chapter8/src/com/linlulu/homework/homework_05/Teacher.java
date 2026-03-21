package com.linlulu.homework.homework_05;

public class Teacher extends Employee{//教师 子类
    //特别属性
    private int classDays;//授课天数
    private double daySal;//课时费

    public Teacher(String name, double basicSal, int work_months, int classDays, double daySal) {
        super(name, basicSal, work_months);
        this.classDays = classDays;
        this.daySal = daySal;
    }

    public int getClassDays() {
        return classDays;
    }

    public void setClassDays(int classDays) {
        this.classDays = classDays;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    @Override
    public double yearSal() {
        return (super.yearSal() + classDays * daySal);//重写了父类Employee的获取年薪资的方法
    }
}
