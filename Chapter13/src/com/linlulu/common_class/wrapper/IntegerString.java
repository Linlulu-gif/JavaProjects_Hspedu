package com.linlulu.common_class.wrapper;

/**
 * @author 林露露
 * @version 1.0
 * 演示 Integer和 String 的相互转换
 */
public class IntegerString {
    public static void main(String[] args) {
        //Integer--->String
        //1.方式1
        Integer i = 10;
        String str1 = i + "";//加上空串
        //2. 方式2
        String str2 = i.toString();

        //3. 方式3
        String str3 = String.valueOf(i);

        /*
        String--->Integer
         */
        //方式1
        Integer k = Integer.valueOf("123");
        System.out.println(k);
        //方式2 parseInteger
        int i1 = Integer.parseInt("456");
    }
}
