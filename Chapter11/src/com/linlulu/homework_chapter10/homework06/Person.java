package com.linlulu.homework_chapter10.homework06;

/**
 * @author 林露露
 * @version 1.0
 */
public class Person {
    private String name;//姓名
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void common(){
        //判断有没有交通工具
        if(!(vehicles instanceof Horse)){
            //获取一匹马
            //向上匹配
            vehicles = new VehiclesFactory().getHorse();
        }
        //马儿工作
        vehicles.work();
    }

    public void passRiver(){
        //获取一条船
        if(!(vehicles instanceof Boat)){
            vehicles = new VehiclesFactory().getBoat();
        }
        //船开始工作
        vehicles.work();
    }
}
