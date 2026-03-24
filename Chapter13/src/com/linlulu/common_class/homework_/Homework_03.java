package com.linlulu.common_class.homework_;

/**
 * @author 林露露
 * @version 1.0
 */
public class Homework_03 {
    public static void main(String[] args) {
        /**
         * 编写java程序，输入：Han shun Ping
         * 输出：Ping,Han .S的形式，.S是中间的单词的首字母
         */
        //分析，输入是一个字符串，输出也是一个字符串
        String str = new String("Lin lu Lu");
        System.out.println("============名字改变形式前=============");
        System.out.println(str);
        //封装成一个方法
        System.out.println("============名字改变形式后=============");
        try {
            printName(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void printName(String name){
        if(name == null){
            throw new RuntimeException("name输入为null!!!!");
        }
        //1.split方法先得到各个字串
        //    String.split(" ");
        String[] strs = name.split(" ");
        String pattern = "%s,%s .%c";
        System.out.println(String.format(pattern,strs[2],strs[0],strs[1].toUpperCase().charAt(0)));
    }
}
