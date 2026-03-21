package com.linlulu.homework.homework_04;

public class Employee {//员工类 ---- 父类
    //员工属性
    private String name;//姓名
    private double day_sal;//单日工资
    private int work_days;//工作天数
    //根据需求描述：分析出来 属性 员工等级 level
    private double level;//员工薪资级数

    public Employee(String name, double day_sal, int work_days, double level) {
        this.name = name;
        this.day_sal = day_sal;
        this.work_days = work_days;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDay_sal() {
        return day_sal;
    }

    public void setDay_sal(double day_sal) {
        this.day_sal = day_sal;
    }

    public int getWork_days() {
        return work_days;
    }

    public void setWork_days(int work_days) {
        this.work_days = work_days;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    //打印工资
    public void printSal(){
        //打印员工薪资
        System.out.print(name + "工资是：");
    }
}
