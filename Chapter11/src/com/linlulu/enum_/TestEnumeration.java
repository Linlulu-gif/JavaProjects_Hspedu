package com.linlulu.enum_;

/**
 * @author 林露露
 * @version 1.0
 */
public class TestEnumeration {
    /**
     * 演示 创建使用 enum 类
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(ChineseZodiac.DRAGON);
    }
}

/**
 * 自定义枚举对象举例
 * 0.构造器私有化
 * 1.不需要提供setter方法，因为枚举对象 往往 只读
 * 2.对枚举对象/属性  使用 final + static 共同修饰， \
 * 实现底层优化:原因 就是 对于 static 修饰的成员，加载时浪费资源，final修饰后，使用时就不用加载类了！！！！！
 * 3.枚举对象名 通常是 全部大写，常量的命名规范
 * 4.枚举对象，根据需要，可以有多个属性
 */
class Season{
    /**
     * 季节
     */
    //属性
    private String seaName;//季节名字
    private String seaDesc;//季节描述

    //方法
    //1.将构造器私有化  外部 new 不了
    private Season(String seaName, String seaDesc) {
        this.seaName = seaName;
        this.seaDesc = seaDesc;
    }
    //2.仅仅提供getter method，防止属性被修改
    public String getSeaName() {
        return seaName;
    }

    public String getSeaDesc() {
        return seaDesc;
    }
    //3.创建final,static 对象，枚举出所有对象
    public static final Season SPRING = new Season("春天","温暖");
    public static final Season SUMMER = new Season("夏天","炎热");
    public static final Season AUTUMN = new Season("秋天","凉爽");
    public static final Season WINTER = new Season("冬天","寒冷");

    @Override
    public String toString() {
        return "Season{" +
                "seaName='" + seaName + '\'' +
                ", seaDesc='" + seaDesc + '\'' +
                '}';
    }
}

/**
 * 演示 使用 enum定义的 enum类  Chinese zodiac 生肖
 * 1.使用 enum 替代 class
 * 2. public static final ChineseZodiac RAT = new ChineseZodiac("鼠");
 * 直接使用： RAT("鼠"),------------------------------5. 必须写在类体的最上面
 * 常量名（实参列表）
 * 3.//必有用逗号隔开,,最后一个用分号
 */
enum ChineseZodiac{
    RAT("鼠"),//必有用逗号隔开,,最后一个用分号
    OX("牛"),
    TIGER("虎"),
    RABBIT("兔"),
    DRAGON("龙"),
    SNAKE("蛇"),
    HORSE("马"),
    GOAT("羊"),
    MONKEY("猴"),
    ROOSTER("鸡"),
    DOG("狗"),
    PIG("猪");
    private String name;

    ChineseZodiac(String name) {//1.private是冗余的
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ChineseZodiac{" +
                "name='" + name + '\'' +
                '}';
    }
}
