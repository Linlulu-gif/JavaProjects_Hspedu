package com.linlulu.interface_;

public class TestInterface {//外部类
    public static void main(String[] args) {
        USB usb = new USB() {//匿名内部类
            @Override
            public void start() {
                System.out.println("鼠标开始工作了**************");
            }

            @Override
            public void stop() {
                System.out.println("鼠标停止工作了**************");
            }
        };

        usb.start();
        usb.stop();
        System.out.println("usb.getClass() = " + usb.getClass());

        usb = new Earphone();
        TestInterface testInterface = new TestInterface();

        testInterface.work(usb);//向上转型
    }

    public void work(USB usb){
        usb.start();
        usb.stop();
    }
}
