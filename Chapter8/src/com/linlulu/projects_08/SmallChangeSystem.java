package com.linlulu.projects_08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//在这里实现   零钱通  菜单显示
public class SmallChangeSystem {
    public static void main(String[] args) {
        /*
            化繁为简
            将需求中的菜单一步步搭建出来，能够完成基本的选择某个模块的功能
            1. 先完成菜单显示
            2. 完成零钱通明细
            （1）使用数组保存 入账信息 和 消费；（2）使用对象； （3）使用字符串拼接 sout即可
            3. 完成收益入账
        */
        boolean flag = true;// 控制系统运行
        Scanner scanner = new Scanner(System.in);
        // 1. 先完成菜单显示
        // 2. 完成零钱通明细
        String details = "********************零钱通明细************************";

        // 3. 完成收益入账
        double inMoney;//入账
        double outMoney;//消费金额
        String note;//消费说明
        Date date;//日期
        double balance = 0;//余额
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");//HH:mm:ss
        // 使用24小时制，避免12小时制混淆
        // 4. 改善退出
        String if_exit = "n";//默认不退出
        do {
            System.out.println("\n********************零钱通菜单************************");
            System.out.println("\t\t\t\t1 零钱通明细\t\t\t\t");
            System.out.println("\t\t\t\t2 收益 入账\t\t\t\t");
            System.out.println("\t\t\t\t3 消    费\t\t\t\t");
            System.out.println("\t\t\t\t4 退出 系统\t\t\t\t");
            System.out.print("请选择(1-4): ");
            String choose = scanner.next();

            //使用switch结构完成多个模块的业务跳转
            switch (choose) {
                case "1":
                    System.out.println(details);//完成
                    break;
                case "2":
                    System.out.println("请输入入账金额：");
                    inMoney = scanner.nextDouble();
                    if (inMoney <= 0) {
                        System.out.println("入账金额输入错误！！！！！");
                        break;
                    }
                    balance += inMoney;
                    date = new Date();//获取当前时间
                    details += ("\n收益入账\t+" + inMoney + "\t" + dateFormat.format(date) + "\t" + balance);
                    System.out.println("入账成功（-_-)");
                    break;
                case "3":
                    System.out.println("输入消费金额：");
                    outMoney = scanner.nextDouble();
                    if (outMoney <= 0 || outMoney > balance) {
                        System.out.println("消费金额无效 或 超出了当前余额");
                        break;
                    }
                    System.out.println("输入消费说明：");
                    note = scanner.next();
                    balance -= outMoney;
                    date = new Date();//获取当前时间
                    details += ("\n" + note + "\t-" + outMoney + "\t" + dateFormat.format(date) + "\t" + balance);
                    System.out.println("消费成功（>_<)");
                    break;
                case "4":
                    //这些是我自己写的。。。 逻辑比较混乱
//                    while(true){
//                        System.out.println("你确定退出吗？y/n");
//                        if_exit = scanner.next();
//                        if("y".equals(if_exit)){
//                            System.out.println("********************退出 系统************************");
//                            flag = false;
//                            break;
//                        } else if("n".equals(if_exit)){
//                            break;
//                        }
//                    }
                    while(true){
                        //实现判断用户输入的到底是不是y/n
                        System.out.println("你确定要退出吗？y/n");
                        if_exit = scanner.next();
                        if("y".equals(if_exit) || "n".equals(if_exit)){
                            break;
                        }
                    }
                    if("y".equals(if_exit)){
                        flag = false;
                        System.out.println("********************退出 系统************************");
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择！！！");
            }
        } while (flag);

        scanner.close();
    }
}
