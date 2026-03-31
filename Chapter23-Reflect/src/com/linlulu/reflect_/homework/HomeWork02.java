package com.linlulu.reflect_.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 林露露
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.利用Class类得到File类的class对象
        Class<?> File = Class.forName("java.io.File");

        //2.在控制台打印File类的所有构造器
        Constructor<?>[] fileDeclaredConstructors = File.getDeclaredConstructors();
        for (Constructor<?> fileDeclaredConstructor : fileDeclaredConstructors) {
            System.out.println(fileDeclaredConstructor.toString());
        }

        //3.通过newInstance的方法创建File对象，并创建E:\mynew.txt文件
        String file_path = "E:\\mynew.txt";
        Constructor<?> fileDeclaredConstructor = File.getDeclaredConstructor(String.class);
        Object file = fileDeclaredConstructor.newInstance(file_path);

        Method createNewFile = File.getDeclaredMethod("createNewFile");
        createNewFile.invoke(file);
    }
}
