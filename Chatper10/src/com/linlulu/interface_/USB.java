package com.linlulu.interface_;

/**
 * 演示接口的定义
 * 1.接口 只能默认 or public
 * 2.接口本质上是 Java对于 多继承的一个补充，本质还是 “继承”
 * 3.接口内可以有：属性（pubic final static 可省略）; 方法（public abstract 可省略）;
 * default method; static method.
 * 4.接口 通过 类 implements 实现 interface 所有 抽象方法
 * 5.接口 可以 implements 多个接口
 * 6.接口拥有 多态性（接口数组；接口参数多态；接口的多态传递）
 * 7.接口不允许 实例化
 */
public interface USB {
    //1.属性
    int property = 0;//public final static (必须初始化)
    //2. default method
    default void sayHello(){
        System.out.println("Hello--------------");
    }
    //3.static method
    static void sayOk(){
        System.out.println("OK--------------");
    }
    //4. public abstract method
    void start();
    void stop();
}
