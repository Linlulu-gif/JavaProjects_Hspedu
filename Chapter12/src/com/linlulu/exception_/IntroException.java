package com.linlulu.exception_;

/**
 * @author 林露露
 * @version 1.0
 */
public class IntroException {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            System.out.println("num1 / num2 = " + num1 / num2);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("异常原因："+ e.getMessage());//输出异常的信息
        }
        System.out.println("程序继续执行.............");
    }
}
