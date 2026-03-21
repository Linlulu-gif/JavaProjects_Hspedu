package com.linlulu.debug_;

public class Debug_01 {
    //演示 F8(逐行执行)，debug过程
    // 1.设置断点
    // 2.Debug执行
    // 3.F8 单步执行，一行行的执行
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("sum = " + sum);
        }
    }
}
