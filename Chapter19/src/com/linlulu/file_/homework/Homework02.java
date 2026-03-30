package com.linlulu.file_.homework;

import org.junit.Test;

import java.io.*;

/**
 * @author 林露露
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\javacode\\YangHuiSanJiao.txt";

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = null;
        int lineNum = 1;
        while((line = reader.readLine()) != null){
            System.out.println(lineNum++ + line);
        }
    }

    @Test
    public void test() throws IOException {
        /**
         * 演示使用 转换流
         */
        String filePath = "E:\\javacode\\YangHuiSanJiao.txt";
        InputStreamReader streamReader = new InputStreamReader(new FileInputStream(filePath), "utf-8");

        //若此想要按行读取数据，则需要将其转化成BufferedReader
        BufferedReader reader = new BufferedReader(streamReader);
        String line = null;
        int lineNum = 1;

        while((line = reader.readLine()) != null){
            System.out.println(lineNum++ + line);
        }
    }
}
