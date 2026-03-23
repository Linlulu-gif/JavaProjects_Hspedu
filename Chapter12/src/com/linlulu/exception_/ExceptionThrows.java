package com.linlulu.exception_;

/**
 * @author 林露露
 * @version 1.0
 */
public class ExceptionThrows {
    public static void main(String[] args) throws ArithmeticException{
        cal(1000,0);
    }

    public  static int cal(int num1,int num2) throws ArithmeticException{
        return num1 / num2;//这里可能有  除零异常
    }
}
