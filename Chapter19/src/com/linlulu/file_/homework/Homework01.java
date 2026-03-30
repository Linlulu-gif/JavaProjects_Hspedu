package com.linlulu.file_.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 林露露
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {
        String dirPath = "E:\\mytemp";

        File dir = new File(dirPath);
        if(!dir.exists()){//若文件夹不存在，则创建一个文件夹
            dir.mkdir();
        }

        String filePath = dirPath + "\\temp.txt";
        File file = new File(filePath);
        if(!file.exists()){
            //若文件不存在，则创建文件
            file.createNewFile();
        } else{
            System.out.println("文件" + filePath + "已经存在！！");
        }
        //将文件中写入Hello,World!!
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write("Hello,World!!!");
        writer.close();
    }
}
