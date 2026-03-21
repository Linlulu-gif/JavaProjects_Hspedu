package com.linlulu.extend_;

public class Notepad extends Computer {
    private String color;//颜色

    public Notepad(String cpu, String memory, String disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void printInfo(){
        System.out.println("Notepad信息如下：");
        System.out.println(getDetails() + "\tcolor = " + getColor());
    }
}
