package com.linlulu.projects_08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 在这里实现 零钱通的 各个 功能
 * 1. 先完成菜单显示
 * 2. 完成零钱通明细
 * （1）使用数组保存 入账信息 和 消费；（2）使用对象； （3）使用字符串拼接 sout即可
 * 3. 完成收益入账
 * 4. 完成消费
 * 5. 退出系统
 *
 * ======>将各个功能封装成一个个方法
 */

public class SmallChangeSysOOP {
    private boolean flag = true;// 控制系统运行
    private String details = "********************零钱通明细************************";
    private double balance = 0;//显式声明属性的值
    private Scanner scanner = new Scanner(System.in);
    private Date date;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public void display() {
        do {
            System.out.println("\n********************选择零钱通菜单************************");
            System.out.println("\t\t\t\t1 零钱通明细\t\t\t\t");
            System.out.println("\t\t\t\t2 收益 入账\t\t\t\t");
            System.out.println("\t\t\t\t3 消    费\t\t\t\t");
            System.out.println("\t\t\t\t4 退出 系统\t\t\t\t");
            System.out.print("请选择(1-4): ");
            String choose = scanner.next();

            //使用switch结构完成多个模块的业务跳转
            switch (choose) {
                case "1":
                    this.printDetails();
                    break;
                case "2":
                    this.income();//入账
                    break;
                case "3":
                    this.outcome();//消费
                    break;
                case "4":
                    this.exit_system();
                    break;
                default:
                    System.out.println("选择有误，请重新选择！！！");
            }
        } while (flag);
    }

    public void printDetails() {
        System.out.println(details);//完成
    }

    public void income() {
        double inMoney;//入账金额
        System.out.println("请输入入账金额：");
        inMoney = scanner.nextDouble();
        if (inMoney <= 0) {
            System.out.println("入账金额输入错误！！！！！");
//            break;
            return;//直接返回
        }
        balance += inMoney;
        date = new Date();//获取当前时间
        details += ("\n收益入账\t+" + inMoney + "\t" + dateFormat.format(date) + "\t" + balance);
        System.out.println("入账成功（-_-)");
    }

    public void outcome() {
        double outMoney;//消费金额
        String note;//消费说明
        System.out.println("输入消费金额：");
        outMoney = scanner.nextDouble();
        if (outMoney <= 0 || outMoney > balance) {
            System.out.println("消费金额无效 或 超出了当前余额");
//            break;
            return;
        }
        System.out.println("输入消费说明：");
        note = scanner.next();
        balance -= outMoney;
        date = new Date();//获取当前时间
        details += ("\n" + note + "\t-" + outMoney + "\t" + dateFormat.format(date) + "\t" + balance);
        System.out.println("消费成功（>_<)");
    }

    public void exit_system() {
        String if_exit;//用于接收输入的y/n
        while (true) {
            //实现判断用户输入的到底是不是y/n
            System.out.println("你确定要退出吗？y/n");
            if_exit = scanner.next();
            if ("y".equals(if_exit) || "n".equals(if_exit)) {
                break;
            }
        }
        if ("y".equals(if_exit)) {
            flag = false;
            System.out.println("********************退出 系统************************");
        }
    }
}
