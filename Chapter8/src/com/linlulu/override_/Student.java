package com.linlulu.override_;

public class Student extends Person {
    private long id;
    private double score;

    public Student(String name, int age, long id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //构成方法重写
//    @Override
    public String say() {
        return super.say() + ",我的id是" + getId()
                + ",我取得的分数为" + getScore();
    }
}
