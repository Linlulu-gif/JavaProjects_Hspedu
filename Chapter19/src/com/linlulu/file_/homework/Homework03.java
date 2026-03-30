package com.linlulu.file_.homework;

import java.io.*;
import java.util.Properties;

/**
 * @author 林露露
 * @version 1.0
 * 演示 使用 Properties
 * 演示使用 序列化 和 反序列化
 */
public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String pro_path = "src\\dog.properties";
        //1. new 一个 Properties对象
        Properties properties = new Properties();
        //2.加载 .properties文件
        properties.load(new InputStreamReader(new FileInputStream(pro_path),"utf8"));
        //3.获取properties文件中的K-V
        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color");
        //4.new 一个 Dog 对象
        Dog dog = new Dog(name, age, color);

        //5.输出显示一下
        System.out.println(dog);

        //序列化 和 反序列化
        String ob_path = "E:\\javacode\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ob_path));
        oos.writeObject(dog);

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ob_path));
        Dog dog1 = (Dog)ois.readObject();
        System.out.println(dog1);
    }
}
