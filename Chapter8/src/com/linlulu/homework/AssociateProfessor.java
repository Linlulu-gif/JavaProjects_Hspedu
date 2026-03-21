package com.linlulu.homework;
//副教授类
public class AssociateProfessor extends Teacher{
    private double salary_level = 1.2;

    public AssociateProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public double getSalary_level() {
        return salary_level;
    }

    public void setSalary_level(double salary_level) {
        this.salary_level = salary_level;
    }

    @Override
    public void introduce(){
        System.out.println("副教授" + "\t姓名：" + super.getName() + "\t年龄：" + super.getAge() + "\t职称："
                + super.getPost() + "\t基本工资：" + super.getSalary() + "\t工资级别：" + salary_level);
    }
}
