package com.linlulu.abstract_.template_;

public class AA extends Template{
    //属性
    //若是修改，即：增加工作job的业务逻辑，则需要重复撰写一些代码
    //方法1.抽取这些内容放到另一个方法中
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
        for (int i = 0; i <= 200000000; i++) {
            sum += i;
        }
    }
}
