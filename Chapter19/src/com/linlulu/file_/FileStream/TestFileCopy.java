package com.linlulu.file_.FileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 林露露
 * @version 1.0
 *
 * 使用 FileInputStream 和 FileOutputStream 完成 文件的 拷贝
 * 文件1  ——————>程序（流对象）——————> 文件2
 */
public class TestFileCopy {
    public static void main(String[] args) {
        String srcFilePath = "E:\\javacode\\报名照片.jpg";
        String destFilePath = "E:\\javacode\\报名照片0.jpg";

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(srcFilePath);
            outputStream = new FileOutputStream(destFilePath);
            //FileOutputStream--------->

            byte[] fileBytes = new byte[1024];//定义一个字节数组，用于接收读取的数据
            int numLen = 0;
            while((numLen = inputStream.read(fileBytes, 0, fileBytes.length)) != -1){
                outputStream.write(fileBytes, 0, numLen);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        } finally {
            try {
                if(inputStream != null){
                    inputStream.close();
                }
                if(outputStream != null){
                    outputStream.close();
                }
            } catch (IOException e) {
//                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}


