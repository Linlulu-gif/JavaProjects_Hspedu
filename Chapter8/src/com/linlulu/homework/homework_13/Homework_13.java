package com.linlulu.homework.homework_13;

public class Homework_13 {
    public static void main(String[] args) {
        //演示使用Chapter8 的13 题
        //（7）定义多态数组，里面保存了2个学生和2个教师，要求按照 年龄从高到底排序
        Person[] people = new Person[4];
        people[0] = new Student("张三", '男', 17, "001829");
        people[1] = new Student("李四", '女', 19, "001828");
        people[2] = new Teacher("孟夏", '女', 27, 8);
        people[3] = new Teacher("刘海三", '男', 25, 4);

        Homework_13 homework_13 = new Homework_13();
        homework_13.sortBubble(people);
        System.out.println("******************按年龄从大到小排序后***********************");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }

        ((Teacher)people[0]).printInfo();
        System.out.println("***********************************************************");
        ((Student)people[3]).printInfo();
    }

    public void sortBubble(Person[] persons) {//冒泡排序：年龄age按从大到小,  多态参数
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if(persons[j].getAge() < persons[j+1].getAge()){
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }
}
