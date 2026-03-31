package com.linlulu.reflect_.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 林露露
 * @version 1.0
 * 要求：通过反射修改私有变量
 */
public class HomeWork01 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //要求：
        /*
        1.利用Class类得到私有的name属性，修改name属性的值
        2.调用getName方法打印name属性的值
         */
        //1.方式2得到Class对象-----一个类 的 结构信息
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        //1.1 创建对象
        PrivateTest instance = privateTestClass.newInstance();
        //2.拿到属性字段对象 Field name
        Field name = privateTestClass.getDeclaredField("name");
        //3.爆破访问设置
        name.setAccessible(true);
        name.set(instance,"张三");
        System.out.println(name.get(instance));

        //4.访问方法
        Method name1 = privateTestClass.getMethod("getName");
        System.out.println(name1.invoke(instance));
    }
}

class PrivateTest{
    private String name = "hellokitty";
    public String getName(){
        return this.name;
    }
}
