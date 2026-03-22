package com.linlulu.abstract_.template_;

/**
 * Template 设计模式的 本质
 * 将各个类中的同一业务代码逻辑提取出来封装在 父类抽象类内实现
 * 然后，其特有的工作逻辑方法抽象化放在父类
 * 子类继承重写即可！！！！！
 */
abstract public class Template {
    abstract public void job();//抽象方法
    public void calJobTime(){
        long start = System.currentTimeMillis();//当前时间
        job();
        long end = System.currentTimeMillis();//任务完成时间

        System.out.println("任务完成时间：" + (end - start));
    }
}
