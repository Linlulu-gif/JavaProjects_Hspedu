package com.linlulu.abstract_.template_;

public class BB extends Template{
    //属性
//    public void calJobTime(){
//        long start = System.currentTimeMillis();//当前时间
//        job();
//        long end = System.currentTimeMillis();//任务完成时间
//
//        System.out.println("任务完成时间：" + (end - start));
//    }

    //方法
    public void job(){
        long sum = 0;
        for (int i = 0; i <= 2000000000; i++) {
            sum -= i;
        }
    }
}
