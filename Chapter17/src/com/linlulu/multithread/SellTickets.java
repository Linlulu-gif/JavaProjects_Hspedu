package com.linlulu.multithread;

/**
 * @author 林露露
 * @version 1.0
 * 使用多线程出售票务
 * （1） 使用  extends Thread 方法
 * 缺陷：----------------------------
 * 1.存在 票数 超卖
 */
public class SellTickets {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();

        //启动线程
        ticket1.start();
        ticket2.start();
        ticket3.start();
    }
}

class Ticket extends Thread {
    private static int ticketNum = 100;//原始票数 100
//    private static boolean loop = true;//循环变量

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("目前电影票卖完了**************");
                break;
            }


            try {
                Thread.sleep(50);//线程沉睡0.5s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("售票员" + Thread.currentThread().getName() +
                    "售出 1 张票" + "剩余票数为：" + (--ticketNum));
        }
    }
}


