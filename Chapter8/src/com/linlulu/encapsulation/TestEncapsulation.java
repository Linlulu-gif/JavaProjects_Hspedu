package com.linlulu.encapsulation;

/**
 * 演示使用
 * 1. import package
 * 2. Keymap //快捷键  ctrl D 复制行  ctrl Z 上一步操作
 * alt R 运行程序 alt / 自动补全 ctrl B 查找方法处处
 * ctrl alt L 自动格式化代码 。。。 .var enter
 * alt insert----->generate
 * 生成变量名
 * 3. 模板 template----> sout fori main
 */
public class TestEncapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张无忌");
        person.setAge(150);
        person.setSalary(30000);

        person.showInfo();//这里还考察到了this指针属于隐藏属性，始终指向调用他的对象
    }
}

/**
 * 定义一个employee类
 * 1.（姓名，年龄，薪水）
 * 2. 年龄介于1-120之间，合理即设置；否则，默认值18
 * 3. 年龄、工资不能直接查看
 * 4. 姓名 name 介于2-6个字符
 */
class Person {
    //封装第一步，属性私有化
    public String name;
    private int age;
    private double salary;//薪水

    //封装第二步，setXxx和getXxx方法

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //我们可以将set方法写在构造器中，这样仍然可以验证数据
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
        setName(name);
        setAge(age);
    }

    public Person() {//将覆盖的默认构造方法显式给出
    }

    //下面是所需的set和get方法


    public String getName() {
        return name;
    }

    public void setName(String name) {//名字需要介于2-6个字符，给个默认值 张三
        //增加的数据合法化验证业务逻辑
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("你输入的姓名长度不在2-6个字符之间！！");
            this.name = "张三";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {//年龄必须1-120之间，不在范围给个默认值 18
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("你输入的年龄不对，应介于1-120之间！！！");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("个人信息如下：");
        System.out.println("name = " + this.name + "\tage = " + this.age + "\tsalary = "
                + this.salary);
    }
}