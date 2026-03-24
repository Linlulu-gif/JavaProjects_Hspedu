package com.linlulu.common_class.stringbuffer_;

import java.util.Scanner;

/**
 * @author 林露露
 * @version 1.0
 *
 * //针对输入的 字符串1234567.458，转换成   1,234,567.458
 *
 * 演示使用 StringBuffer的常用方法
 */
public class TestStringBuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入价格：");

        double price = scanner.nextDouble();

        StringBuffer stringBuffer = new StringBuffer(price + "");//这里巧用了 double ----> String

//        int i = stringBuffer.indexOf(".");//找到小数点的下标
        for (int j = stringBuffer.indexOf(".") - 3; j > 0; j -= 3) {//这里的 > 0很巧妙
            stringBuffer = stringBuffer.insert(j,",");
        }
        System.out.println(stringBuffer);
    }
}
