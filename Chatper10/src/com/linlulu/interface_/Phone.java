package com.linlulu.interface_;

public class Phone implements USB{

    @Override
    public void start() {
        System.out.println("手机开始工作了**************");
    }

    @Override
    public void stop() {
        System.out.println("手机停止哦——————————————————");
    }
}
