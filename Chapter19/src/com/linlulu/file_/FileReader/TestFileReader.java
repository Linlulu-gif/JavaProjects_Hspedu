package com.linlulu.file_.FileReader;

import java.io.*;

/**
 * @author 林露露
 * @version 1.0
 * 演示使用 FileReader 和 FileWriter (字符输入流/字符输出流)
 */
public class TestFileReader {
    public static void main(String[] args) {
        String srcPath = "E:\\javacode\\YangHuiSanJiao.java";
        String destPath = "E:\\javacode\\YangHuiSanJiao.txt";
        File file = new File(destPath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        int dataNum = 0;
        char[] buf = new char[128];

        try {
            fileReader = new FileReader(srcPath);
            fileWriter = new FileWriter(destPath,true);

            while((dataNum = fileReader.read(buf)) != -1){
                //dataNum 是 返回 的字符的计数，-1文件读完
                System.out.print(new String(buf,0,dataNum));
                fileWriter.write(buf,0,dataNum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fileReader != null){
                    fileReader.close();
                }
                if(fileWriter != null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


