package com.linlulu.extend_;

public class PC extends Computer {
    private String brand;//品牌

    public PC(String cpu, String memory, String disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    //打印信息
    public void printInfo() {
        System.out.println("PC信息如下：");
        //这种方法虽然可以打印输出PC的信息，但很冗余，且不能复用程序代码
//        System.out.println("cpu = " + getCpu() + "memory = " + getMemory() + "disk = " + getDisk()
//                + "brand = " + getBrand());
        System.out.println(getDetails() + "\tbrand = " + getBrand());//已知的 + （拼接） 特有的
        //要习惯这种编程思维
    }
}
