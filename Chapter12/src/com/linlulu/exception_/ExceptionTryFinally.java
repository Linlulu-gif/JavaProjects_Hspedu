package com.linlulu.exception_;

/**
 * @author 林露露
 * @version 1.0
 */
public class ExceptionTryFinally {
    public static void main(String[] args) {
        int num[] = {1, 3, -1, 24, 5, 2};
        try {
            for (int i = 0; i <= num.length; i++) {//这里会有ArrayIndexOutOfBounds Exception
                System.out.println("num[" + i + "] = " + num[i]);
            }
            System.out.println("程序在这里执行了...........");
        } finally {
            System.out.println("程序。。。。。。。。。。。。。");
        }
        System.out.println("程序继续执行.............");
    }
}
