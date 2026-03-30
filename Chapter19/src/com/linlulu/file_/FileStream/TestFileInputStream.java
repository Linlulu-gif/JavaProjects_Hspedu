package com.linlulu.file_.FileStream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 林露露
 * @version 1.0
 * 测试演练 字节流 输入流 接口 的 实现类 FileInputStream
 */
public class TestFileInputStream {
    public static void main(String[] args) throws IOException {
//        //1.使用File创建文件引用
//        File file = new File("E:\\hello.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println("------------------展示FileInputStream(read())-----------------");
        showFileInputStream();
        System.out.println("\n------------------展示FileInputStream(read(byte[]))-----------------");
        ReadTest();
    }

    public static void showFileInputStream() {
        FileInputStream fileInputStream = null;
        int dataFile = 0;
        try {
            fileInputStream = new FileInputStream("E:\\hello.txt");//按照  单个字节  读入数据
            while ((dataFile = fileInputStream.read()) != -1) {
                System.out.print((char) (dataFile));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadTest() {//抛出异常
        FileInputStream fileInputStream = null;
        byte[] data = new byte[8];
        int length = 0;
        try {
            fileInputStream = new FileInputStream("E:\\hello.txt");
            while ((length = fileInputStream.read(data)) != -1) {
                System.out.print(new String(data, 0, length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
