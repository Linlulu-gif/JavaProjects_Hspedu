package com.linlulu.interface_;

public class Earphone implements USB{

    @Override
    public void start() {
        System.out.println("耳机开始工作***************");
    }

    @Override
    public void stop() {
        System.out.println("耳机停止工作了————————————————");
    }
}
