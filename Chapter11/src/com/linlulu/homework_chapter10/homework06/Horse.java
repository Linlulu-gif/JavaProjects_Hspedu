package com.linlulu.homework_chapter10.homework06;

/**
 * @author 林露露
 * @version 1.0
 */
public class Horse implements Vehicles {
    private String name;

    public Horse(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println("一般情况下，" + name + "马儿快快跑...........");
    }
}
