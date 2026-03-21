package com.linlulu.object_;

//演示使用== 和 equals方法（面试题）
//tip: ctrl + B可以查看系统提供方法的源代码
public class TestEquals {
    public static void main(String[] args) {
        //1. == 是比较运算符
        //2. 当比较的是两个基本类型数据时 考虑的是 值 是否相等
        //3. 当比较的是两个对象 或 数组时， 考虑的是 地址是否相等，
        //也就是是否是同一个对象
        int num1 = 10;
        int num2 = 20;
        int num3 = 10;
        System.out.println("num1 == num2 :" + (num1 == num2));
        System.out.println("num2 == num3 :" + (num3 == num1));

        Demo zhangsan = new Demo("zhangsan");
        Demo zhaosi = new Demo("zhangsan");
        Demo zhangsan_1 = zhangsan;
        System.out.println("zhangsan == zhaosi\t" + (zhangsan == zhaosi));//false--->address 不同
        System.out.println("zhangsan == zhangsan_1\t" + (zhangsan == zhangsan_1));//true----> the same object
        //4. equals是Object类中的boolean返回值的方法，仅仅用于比较两个对象是否相同（地址相同否）
        //5. 作为Object的子类，往往需要将equals方法进行重写，后续也用于比较两个对象的各个属性是否相等
        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer(10);
        /*
         * 基本类型对于equals方法的重写
         * public boolean equals(Object obj) {
         * if (obj instanceof Integer) {
         *    return value == ((Integer)obj).intValue();//判断值是否相等，obj向下转型，
         *  //方便使用子类特有方法intValue()
         * }
         * return false;
         * }
         */
        System.out.println("integer1.equals(integer2) \t " + integer1.equals(integer2));//true
        System.out.println("integer1 == integer2 \t " + (integer1 == integer2));//false

        String s1 = new String("Tomcat");
        String s2 = new String("Tomcat");

        System.out.println("s1 == s2\t" + (s1 == s2));
        System.out.println("s1.equals(s2)\t" + s1.equals(s2));
        /*
         public boolean equals(Object anObject) {
            if (this == anObject) {//首先 判断当前对象是否是同一个对象
                return true;
            }
            if (anObject instanceof String) {// 其次 判断传过来的对象是否属于String类对象 或子类对象
                String aString = (String)anObject;//向下转型
                if (!COMPACT_STRINGS || this.coder == aString.coder) {//逐个字符比较，完全相同返回true
                return StringLatin1.equals(value, aString.value);
                }
            }
            return false;
            }
         */
        //Demo类 未重写 equals方法前
        System.out.println("Demo类 未重写 equals方法前");
        System.out.println("zhangsan.equals(zhaosi)\t" + zhangsan.equals(zhaosi));//访问的是Object的默认equals方法
        Object o1 = new Object();
        Object o2 = new Object();
        /*
        public boolean equals(Object obj) {
        return (this == obj);//是否为同一个对象
        }
        */
        System.out.println("o1.equals(o2)\t" + o1.equals(o2));

        System.out.println("Demo类 重写 equals方法后");
        System.out.println("zhangsan.equals(zhaosi)\t" + zhangsan.equals(zhaosi));
        String s = null;
        System.out.println(s instanceof String);//Condition 's instanceof String' is always 'false'
    }
}

class Demo {
    private String para;

    public Demo(String para) {
        this.para = para;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

//    @Override
    //系统自动生成的
//    public boolean equals(Object o) {//重写equals方法
//        if (this == o) return true;//如果，同一个对象，返回true
//        // 若是传过来的对象为 null 或 运行态不一致，返回 false
//        if (o == null || this.getClass() != o.getClass()) return false;
//        Demo demo = (Demo) o;
//        return para.equals(demo.para);
//    }
    @Override
    //自己写
    public boolean equals(Object o){
        //1. 是否是同一个对象
        if(this == o){
            return true;
        }
        //2. 是否传过来的对象与当前对象是同一个类型
        if(o instanceof Demo){
            Demo demo = (Demo)o;//向下转型
            return this.para == demo.para;
        }
        return false;//均不满足，则返回false,即：不是同一个对象
    }
}
