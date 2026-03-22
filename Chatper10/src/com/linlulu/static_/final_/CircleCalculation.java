package com.linlulu.static_.final_;

public class CircleCalculation {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.println("半径为" + circle.getRadius() + "的面积是 "
                + circle.calArea());
    }
}

class Circle {
    //属性
    private double radius;//半径
//    private final double PI = 3.14;//1.第一个位置赋值
    private final double PI;

    {
        PI = 3.14;//2.第二个位置赋值
    }

    public Circle(double radius) {
        this.radius = radius;
//        PI = 3.14//3.第三个位置赋值
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calArea() {
        return PI * radius * radius;//计算面积
    }
}
