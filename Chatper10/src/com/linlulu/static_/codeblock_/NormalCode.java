package com.linlulu.static_.codeblock_;

// 简而言之，普通代码块其本质就是  对于构造函数的的补充
//因此，子类继承父类，创建子类对象时，先加载父类信息，子类信息，在调用父类构造器，子类构造器，
//同时，代码块也就被执行了！！！！代码块被称作    初始化块   也不是没有道理的！！
public class NormalCode {
    public static void main(String[] args) {
        //1. 普通代码块在对象创建时使用
//        new Person("张三");
        /*
        这里执行了normal code block*************
        这里执行了public Person(String name)**********
         */
        //小结：代码块的执行优先于constructor方法
        //2. 子类继承父类，创建子类对象时，看 父类的代码块是否被调用？ 被调用了*****************
        new Student("李四");

        //3.访问类的static 成员时，normal code block不会被执行
    }
}

class Person{
    private String name;

//    //普通代码块
//    {
//        System.out.println("这里执行了normal code block*************");
//    }
    public Person(String name) {
        System.out.println("这里执行了public Person(String name)**********");
        this.name = name;
    }

    //普通代码块
    {
        System.out.println("这里执行了class Person code block*************");
    }
}

class Student extends Person{
    {
        System.out.println("class Student extends Person被执行*************");
    }

    public Student(String name) {
        super(name);
        System.out.println("public Student(String name) {\n" +
                "        super(name);");
    }
}
