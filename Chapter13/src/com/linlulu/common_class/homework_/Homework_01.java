package com.linlulu.common_class.homework_;

/**
 * @author 林露露
 * @version 1.0
 * 1.将字符串的指定部分进行反转
 * 2.编写方法
 * public static String reverse(String str,int start,int end)
 */
public class Homework_01 {
    public static void main(String[] args) {
        String str = "assdffgghhjjdcdsd";

        String string = null;
        try {
            string = reverse(str,4,19);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return;//-----------------------------------------牛逼----------在这里return了，后面就不输出了
        }
        System.out.println("reverseStr =" + string);
   }

    public static String reverse(String str,int start,int end){
        /**
         * 1.暂时不考虑非正常情况
         * 2.完成基本功能后考虑所有正确情况
         * 3.过关斩将-----正确情况取反就是不正确的
         */
        //1.第一关
        if(str == null){
            throw new RuntimeException("输入的字符串为null!!!!");
        }
        //2.第二关
        if(!(start >= 0 && end < str.length() && start < end)){
            throw new RuntimeException("输入的start 和 end 数值不正确！！！");
        }
        //1.先将得到的字符串转换为字符数组
        char[] chars = str.toCharArray();
        //2.遍历字符数组，前后交换即可
        char temp;
        for (int i = start,j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);//3.返回一个构建的新字符串
        //String 的构造器 是能够传一个字符数组的
    }
}
