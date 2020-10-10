package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/home/juanzhe/Documents/IO/temp");

            //Start to read
            int readData = fis.read();
            System.out.println(readData);

            //Second
            readData = fis.read();

            System.out.println(readData);

            while (readData != -1){
                readData = fis.read();
                System.out.println(readData);
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
