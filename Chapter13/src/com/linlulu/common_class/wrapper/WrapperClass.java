package com.linlulu.common_class.wrapper;

/**
 * @author 林露露
 * @version 1.0
 * 在这里演示 包装类 的使用
 * 1. Boolean 和 Character  是独立的
 * 2. Byte, Short, Integer, Long, Float, Double 都是继承 Number类
 *
 * Attention:
 * 1.包装类 让基本数据类型 变成 引用类型 ，方便使用了 类 的 一些方法
 */
public class WrapperClass {
    public static void main(String[] args) {
        Boolean aBoolean = new Boolean(false);//since java9,deprecated

        Character character = new Character('a'); //同上

        //Number
        Byte aByte = new Byte((byte) 19);//同上
        Integer integer = new Integer(19);

        Double aDouble = new Double(17.9);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        //手动装箱
        //方式1.
        int i = 10;
        Integer k = Integer.valueOf(i);

        Integer f = new Integer(i);
        //是手动拆箱
        int s = f.intValue();
        //自 jdk 5之后都是自动装箱/拆箱-------int-----Integer不分彼此
        System.out.println("f.compareTo(k): " + f.compareTo(k));;
        System.out.println("Integer.compare(15,16): " + Integer.compare(15,16));;
        System.out.println("Integer.max(i,f): " + Integer.max(i,f));;
    }
}
