package com.linlulu.polymorphic_.poly_array;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //特有方法 teach()，即 教学
    public void teach(){
        System.out.println(super.getName() + "正在教学==============");
    }

    @Override
    public void say(){
        System.out.println("老师  " + "name = " + getName() + ",age = " + getAge()
                + ",salary = " + getSalary());
    }
}
