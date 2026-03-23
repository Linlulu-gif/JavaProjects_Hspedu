package com.linlulu.homework_chapter10;

/**
 * @author 林露露
 * @version 1.0
 * 匿名内部类当作实参
 */
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calculate() {
            @Override
            public double work(double op1,double op2) {
                return op1 * op2;
            }
        },15,18);
    }
}

interface Calculate{
    public double work(double op1,double op2);
}


class Cellphone{
//    private double op1;
//    private double op2;
    //
    public void testWork(Calculate calculate,double op1,double op2){
        System.out.println(calculate.work(op1,op2));
    }
}
