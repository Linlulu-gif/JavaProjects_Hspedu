package com.linlulu.projects_08;

import java.util.Scanner;

//在这里实现   零钱通  菜单显示
public class SmallChangeSystem {
    public static void main(String[] args) {
        /*
            化繁为简
            1. 将需求中的菜单一步步搭建出来，能够完成基本的选择某个模块的功能
        */
        boolean flag = true;// 进入系统否
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("********************零钱通菜单************************");
            System.out.println("\t\t\t\t1 零钱通明细\t\t\t\t");
            System.out.println("\t\t\t\t2 收益 入账\t\t\t\t");
            System.out.println("\t\t\t\t3 消    费\t\t\t\t");
            System.out.println("\t\t\t\t4 退出 系统\t\t\t\t");
            System.out.print("请选择(1-4): \t");
            String choose = scanner.next();

            //使用switch结构完成多个模块的业务跳转
            switch (choose){
                case "1":
                    System.out.println("********************零钱通明细************************");
                    break;
                case "2":
                    System.out.println("********************收益 入账************************");
                    break;
                case "3":
                    System.out.println("********************消    费************************");
                    break;
                case "4":
                    System.out.println("********************退出 系统************************");
                    flag = false;
                    break;
                default:
            }
        } while (flag);

        scanner.close();
    }
}
