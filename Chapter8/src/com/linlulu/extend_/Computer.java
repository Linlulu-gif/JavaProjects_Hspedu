package com.linlulu.extend_;

public class Computer {
    //无特殊要求，为满足封装思想，成员变量全部私有化 && 加上对应的 set || get方法
    private String cpu;//cpu
    private String memory;//内存
    private String disk;//硬盘

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public Computer(String cpu, String memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }


    public  String getDetails(){//返回Computer详细信息
        return "cpu: " + cpu + "\tmemory: " + memory + "\tdisk: " + disk;
    }
}
