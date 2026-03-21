package com.linlulu.homework.homework_05;

public class Homework_05 {
    public static void main(String[] args) {
        Test test = new Test();
        Waiter waiter = new Waiter("张三", 2500, 12);

//        System.out.print("waiter\t" +  waiter.getName() + "\t年薪资：\t" );
        test.printYearSal(waiter);
        System.out.println("\n************************************************************");
        Scientist scientist = new Scientist("赵明", 9000, 15);
        scientist.setBonus(250000);//设置奖金
//        System.out.print("scientist\t" +  scientist.getName() + "\t年薪资：\t" );
        test.printYearSal(scientist);
    }
}

class Test{//编写测试类
    public void printYearSal(Employee employee){
        // 用于将传入对象的年工资打印出来
        System.out.print(employee.getName() + "\t年薪资：\t" + employee.yearSal());
    }
}