package com.linlulu.polymorphic_.poly_array;

/**
 * 应用实例:现有一个继承结构如下：要求创建 1 个 Person 对象、2 个 Student 对象和 2 个 Teacher 对象, 统一放在数组
 * 中，并调用每个对象
 * say 方法. 应用实例升级：如何调用子类特有的方法，比如
 * Teacher 有一个 teach , Student 有一个 study
 * 怎么调用？
 */
public class PolyArr {
    public static void main(String[] args) {
        Person[] people = new Person[5];
//        people[0].setAge(15);
//        people[0].setName("林露露");
//        //下面四个元素都是向上转型
        people[0] = new Person("王伟", 45);
        people[1] = new Student("张三", 25, 97.5);
        people[2] = new Student("梦凤霞", 29, 77);
        people[3] = new Teacher("刘霞", 26, 79000);
        people[4] = new Teacher("赵刚", 29, 7700);

        for (int i = 0; i < people.length; i++) {
            people[i].say();//依次调用say方法,动态绑定机制
            //在这里遍历对象数组的时候就开始实现或完成对象的特有方法
            if (people[i] instanceof Student) {//返回值true or false,目的是检测变量是否是该类的对象或者是类的子类对象
                Student student = (Student) people[i];//强制转换，向下转型，便于调用子类的特有方法
                student.study();
                // 当然也可以一句语句：((Student)people[i]).study,这不就少创建一个对象引用
            } else if (people[i] instanceof Teacher) {
                Teacher teacher = (Teacher) people[i];
                teacher.teach();
            } else if(people[i] instanceof Person){

            } else{
                System.out.println("你输入的对象有误！！！！");
            }
        }
//
//        Student newStu = (Student) people[1];//向下转型
//        newStu.study();//
//
//        Teacher newTea = (Teacher) people[4];
//        newTea.teach();
    }
}
