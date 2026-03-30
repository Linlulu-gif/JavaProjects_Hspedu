package com.linlulu.multithread;

/**
 * @author 林露露
 * @version 1.0
 * <p>
 * 1.通过实现 Runnable 接口 实现多线程
 * 2.通过 synchronized 实现 互斥锁，防止超卖现象
 */
public class SellTickets_02 {
    public static void main(String[] args) {
        TicketSeller seller = new TicketSeller();

        new Thread(seller).start();
        new Thread(seller).start();
        new Thread(seller).start();
        new Thread(seller).start();
    }
}

@SuppressWarnings({"all"})
class TicketSeller implements Runnable {
    private int numTickets = 100;
    private boolean loop = true;

    public void sell() {
        synchronized (this) {//同步代码块///还有一种常见的方法：同步方法
            if (numTickets <= 0) {
                System.out.println("目前电影票卖完了**************");
                loop = false;
                return;
            }

            try {
                Thread.sleep(50);//线程沉睡0.5s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("售票员" + Thread.currentThread().getName() +
                    "售出 1 张票" + "剩余票数为：" + (--numTickets));
        }
    }

    @Override
    public void run() {

        while (loop) {
            sell();
        }
    }
}

