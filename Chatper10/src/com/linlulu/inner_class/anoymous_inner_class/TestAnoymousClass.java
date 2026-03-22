package com.linlulu.inner_class.anoymous_inner_class;

public class TestAnoymousClass {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {//匿名内部类
            @Override
            public void ring() {
                System.out.println("******懒猪起床了******");
            }
        });

        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("******小伙伴们，快快上课了***********");
            }
        });
    }
}

interface Bell {//铃声

    void ring();//响铃
}

class CellPhone {
    //手机
    public void alarmclock(Bell bell) {
        bell.ring();
    }
}
