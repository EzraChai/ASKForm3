package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/home/juanzhe/Documents/IO/temp");

            /*
            while (true){
                int Data = fis.read();
                if (Data == -1){
                    break;
                }
                System.out.println(Data);
            }

             */

            //change
            int readData = 0;
            while ((readData = fis.read()) != -1){
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
