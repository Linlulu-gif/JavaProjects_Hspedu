package com.linlulu.static_;

//统计加入游戏的小孩人数
public class ChildGame {
    public static void main(String[] args) {
        //传统方法：在main方法中定一个变量count记录参加游戏的熊孩数目
        int count = 0;
        Child child_01 = new Child("小猫");
        child_01.joinGame();
        count ++;


        Child child_02 = new Child("小狐");
        child_02.joinGame();
        count ++;

        Child child_03 = new Child("小狼");
        child_03.joinGame();
        count ++;

        Child child_04 = new Child("小猪");
        child_04.joinGame();
        count ++;

        System.out.println("共有" + count + "个孩子加入了游戏+++++++++");
    }
}

class Child {
    private String name;

    public Child(String name) {
        this.name = name;
    }

    public void joinGame() {
        System.out.println(name + "加入了游戏_______");
    }
}