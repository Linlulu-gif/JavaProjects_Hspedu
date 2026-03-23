package com.linlulu.homework_chapter10.homework06;

/**
 * @author 林露露
 * @version 1.0
 * 描述：
 * 唐僧在取经的路上，只有一匹马，但可以过很多个河流
 */
public class Homework06 {
    public static void main(String[] args) {
        Person tangSeng = new Person("唐僧", null);
        tangSeng.common();

        tangSeng.passRiver();

        tangSeng.common();
    }
}
