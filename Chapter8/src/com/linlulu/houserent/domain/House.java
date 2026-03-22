package com.linlulu.houserent.domain;

public class House {
    //展示House 的主要信息
    private int id;//编号
    private String name;//房主姓名
    private String phone;//电话
    private String address;//房屋地址
    private double rent;//房屋月租金
    private String state;//房屋状态（已出租/未出租）

    //构造器 和setter 和 getter方法

    public House(int id, String name, String phone, String address, double rent, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //重写Object的toString方法，为了方便后面信息的输出

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + phone + "\t" + address + "\t" + rent + "\t" + state;
    }
}
