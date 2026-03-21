package com.linlulu.debug_;

public class Debug_02 {
    //使用Debug查看数组越界异常
    public static void main(String[] args) {
        // debug 数组
        int arr[] = new int[6];
        for (int i = 0; i <= arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
