package com.linlulu.file_.BufferReader;

import org.junit.Test;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 林露露
 * @version 1.0
 * 演示使用 处理流（包装流） BufferedReader
 */
public class TestBufferReader {
    public static void main(String[] args) {

    }
    @Test
    public void testBufferedReader(){
        String srcPath = "E:\\javacode\\YangHuiSanJiao.java";
        BufferedReader bufferedReader = null;
        int len = 0;
        char[] chars = new char[64];

        try {
            bufferedReader = new BufferedReader(new FileReader(srcPath));
            while((len = bufferedReader.read(chars)) != -1){
                System.out.print(new String(chars,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufferedReader != null){
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
