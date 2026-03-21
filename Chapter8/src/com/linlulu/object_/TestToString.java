package com.linlulu.object_;

public class TestToString {
    public static void main(String[] args) {
        Person person = new Person("林露露", 18);
        System.out.println(person);//系统默认调用person.toString方法
        //输出一个字符串：全类名@对象的hashCode十六进制
        //com.linlulu.object_.Person@7ef20235

        //注意：在后续的开发中，往往需要将Object的toString 方法进行重写
        //返回值 由程序员自定义，一般是： 类名和属性信息
    }
}


class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}