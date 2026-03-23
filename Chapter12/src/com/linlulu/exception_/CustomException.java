package com.linlulu.exception_;

import java.util.Scanner;

/**
 * @author 林露露
 * @version 1.0
 * 在这里演示 自定义 异常
 * 一般，继承RuntimeException
 */
public class CustomException {
    public static void main(String[] args) {
        int age;
        System.out.println("请输入你的年龄：");
        age = new Scanner(System.in).nextInt();//这里就不创建了Scanner 引用
        try {
            if(!(age > 0 && age <= 150)){
                throw new AgeOutOfBounds("你输入的年龄有误！！！！！");
            }
        } catch (AgeOutOfBounds e) {
            System.out.println(e.getMessage());
        }
        System.out.println("你输入的年龄 age = " + age);
    }
}

class AgeOutOfBounds extends RuntimeException{//自定义异常
    public AgeOutOfBounds(String message) {
        super(message);
    }


}
