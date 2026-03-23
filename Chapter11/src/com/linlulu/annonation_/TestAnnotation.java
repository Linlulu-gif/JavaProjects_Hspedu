package com.linlulu.annonation_;

/**
 * @author 林露露
 * @version 1.0
 *
 * 演示 JAVA SE的三种常见 注解
 * 1.override
 * 2.deprecated 弃用
 * 3.suppresswarning 抑制警告信息
 */
public class TestAnnotation {
    public static void main(String[] args) {
        BB bb = new BB();
        AA aa = new AA();

        aa.say();
        bb.say();
        bb.ok();//中白线，，，，，弃用只是不推荐使用，不是不能使用；常用于jdk版本//开发版本的升级的兼容
    }
}

//镇压一切unused 警告，，，常常用于类中 或 局部
@SuppressWarnings({"unused"})
class AA{
    private int num;//这里 unused warning
    public void say(){
        System.out.println("I am AA class.........");
    }
}

class BB extends AA{
    @Override
    /*
    @Target 元注解-----修饰注解的注解
    @Target(ElementType.METHOD)   ----- 针对（修饰的）的目标
    @Retention(RetentionPolicy.SOURCE)  ------ 作用域（source源码；class(.class文件)；runtime）
    public @interface Override {
    }

    @interface 注解类
     */
    public void say() {
        System.out.println("I am BB class ........");
    }
    @Deprecated
    public void ok(){

    }
}