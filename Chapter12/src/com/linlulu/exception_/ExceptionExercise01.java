package com.linlulu.exception_;

import java.util.Scanner;

/**
 * @author 林露露
 * @version 1.0
 *
 * 从控制台输入一个整数为止
 */
public class ExceptionExercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String res;
        int num = 0;
        while(true){
            System.out.println("请输入一个整数：");
//            res  = scanner.next();

            try {
                num = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数！！！！");
            }
        }
        System.out.println("你输入的数字：num = " + num);
    }
}
