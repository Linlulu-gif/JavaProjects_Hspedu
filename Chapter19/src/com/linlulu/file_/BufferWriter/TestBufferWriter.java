package com.linlulu.file_.BufferWriter;

import org.junit.Test;

import java.io.*;

/**
 * @author 林露露
 * @version 1.0
 * 演示 BufferWriter
 */
public class TestBufferWriter {
    public static void main(String[] args) {

    }

    @Test
    public void testBufferWriter() {
        String file_path = "E:\\javacode\\YangHuiSanJiao.txt";
        String dest_path = "E:\\javacode\\dest.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file_path));
            bufferedWriter = new BufferedWriter(new FileWriter(dest_path));
            int len = 0;
            char[] chars = new char[32];

            while ((len = bufferedReader.read(chars)) != -1) {
                bufferedWriter.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufferedReader != null){
                    bufferedReader.close();
                }
                if(bufferedWriter != null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
