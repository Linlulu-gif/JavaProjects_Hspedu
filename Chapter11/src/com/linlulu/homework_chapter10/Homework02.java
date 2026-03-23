package com.linlulu.homework_chapter10;

/**
 * @author 林露露
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {

    }
}

class Frock{
    private static int currentNum;//衣服出厂的序列号初始值
    static {
        currentNum = 100000;
    }

    public static int getNextNum(){//生成的上衣唯一序列号
        return currentNum += 100;
    }

    private int serialHumber;

    public int getSerialHumber() {
        return serialHumber;
    }

    public Frock() {
        this.serialHumber = getNextNum();
    }
}

class TestFrock{
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());

        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock1.getSerialHumber());
        System.out.println(frock2.getSerialHumber());
        System.out.println(frock3.getSerialHumber());
    }
}