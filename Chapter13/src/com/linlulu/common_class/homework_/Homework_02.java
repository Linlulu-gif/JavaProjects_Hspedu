package com.linlulu.common_class.homework_;

/**
 * @author 林露露
 * @version 1.0
 */
public class Homework_02 {
    public static void main(String[] args) {
        String name = "林露露";
        String pwd = "12345a";
        String email = "linlulu@sohu.com";

        try {
            registerUser(name,pwd,email);
            System.out.println("========================================");
            String format = "用户%s,密码%s,邮箱%s";
            System.out.println(String.format(format,name,pwd,email));
            System.out.println("用户注册成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //分析
    //public static boolean registerUser(String name,String pwd,String email)
    //1.name 2-4 字符
    //2.pwd 必须是 6位，且全是数字
    //3.邮箱包含@和.,且@在.之前

    public static void registerUser(String name,String pwd,String email){
        //1.第一关  判断名字
        if(!(name != null && name.length() >=2 && name.length() <= 4)){
            throw new RuntimeException("name 2-4 字符 !!!!!");
        }

        //2.第二关，判断pwd
        if(!(pwd != null && pwd.length() == 6 && isDigital(pwd))){
            throw new RuntimeException("pwd 必须是 6位，且全是数字!!!!");
        }

        //3.第三关，判断email
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if(!(email != null && i > 0 && i < j)){
            throw new RuntimeException("邮箱包含@和.,且@在.之前");
        }
    }

    //isDigital
    public static boolean isDigital(String str){
        if(str == null){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
}
