package com.linlulu.generic_;

/**
 * @author 林露露
 * @version 1.0
 */
public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return (year + "-" + month + "-" + day);
    }

    @Override
    public int compareTo(MyDate date) {
        if(year != date.year){
            return year - date.year;
        }

        if(month != date.month){
            return month - date.month;
        }

        return day - date.day;
    }
}
