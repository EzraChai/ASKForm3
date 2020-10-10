package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/home/juanzhe/Documents/IO/temp");

            //Very Important!!!
            byte[] bytes = new byte[24];
            while (true){
                int readCount = fis.read(bytes);
                if (readCount == -1){
                    break;
                }
                System.out.println(new String(bytes,0,readCount));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
