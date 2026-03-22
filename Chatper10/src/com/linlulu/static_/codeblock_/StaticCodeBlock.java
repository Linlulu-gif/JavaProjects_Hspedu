package com.linlulu.static_.codeblock_;

/**
 * 演示  静态代码块的使用细则
 * 1.类的加载
 * 1.1 new 一个对象时
 * 1.2 new 一个 子类对象时
 * 1.3 访问 类的 static 成员 时
 *
 * 2.static code block
 * Details:
 * (****)仅仅在类 加载时被执行，且：：只执行1次；
 *
 * 小结：静态代码块和静态成员的优先级是一样的，优先于普通的
 */
public class StaticCodeBlock {
    public static void main(String[] args) {
        // 1.1 new 一个对象时
//        new Employee("wangshan");
        //1.2 new 一个 子类对象时
//        Manager manager = new Manager("王菲");
        /**
            Employee的 static 代码块被执行******
            Manager static 代码块被执行*********888888888888888888888888888888888888888888888866666666666666666666666
            Employee的 普通代码块被执行******
            *******public Employee(String name)***被执行
            Manager 普通代码块 被执行******
            *******public Manager(String name)***被执行
         */
        // 1.3 访问 类的 static 成员 时
        Employee employee = new Employee("六海里");

        employee.employeeNum ++;
    }
}

class Employee{
    private String name;
    public static int employeeNum;//员工数量

//    static{
//        System.out.println("Employee的 static 代码块被执行******");
//    }

    {
        System.out.println("Employee的 普通代码块被执行******");
    }

    static{
        System.out.println("Employee的 static 代码块被执行******");
    }

    public Employee(String name) {
        this.name = name;
        System.out.println("*******public Employee(String name)***被执行");
    }

    public static void countNum(){
        System.out.println("当前员工数量：" + employeeNum);
    }
}

class Manager extends Employee{

    public Manager(String name) {
        super(name);
        System.out.println("*******public Manager(String name)***被执行");
    }

    static{
        System.out.println("Manager static 代码块被执行*********");
    }

    {
        System.out.println("Manager 普通代码块 被执行******");
    }
}

