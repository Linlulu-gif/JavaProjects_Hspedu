package com.linlulu.enum_;

/**
 * @author 林露露
 * @version 1.0
 * 声明 week enum 类，使用values返回所有的枚举数组，并遍历，输出
 */
public class EnumExercise {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        System.out.println("所有星期的信息如下：");
        for(Week weekday:weeks){
            System.out.println(weekday.getDes());
        }
    }
}

enum Week{
    // list all enum objects
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日")
    ;

    //属性
    private String des;

    Week(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }
}
