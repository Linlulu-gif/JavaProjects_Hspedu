package com.linlulu.interface_;

public class Watch implements USB{
    @Override
    public void start() {
        System.out.println("手表开始工作了***************");
    }

    @Override
    public void stop() {
        System.out.println("手表停止工作了****************");
    }
}
