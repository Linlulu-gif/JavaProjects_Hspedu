package com.linlulu.homework_chapter10.homework06;

/**
 * @author 林露露
 * @version 1.0
 */
public class VehiclesFactory {
    private static Horse horse = new Horse("白龙马");//常量,单例模式---饿汉式

    public Horse getHorse(){
        return horse;
    }

    public Boat getBoat(){
        return new Boat();
    }
}
