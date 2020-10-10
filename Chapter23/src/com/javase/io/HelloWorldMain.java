package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HelloWorldMain {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/home/juanzhe/Documents/IO/Main");

            byte[]bytes = new byte[4];
            /*
            TOO Low
            while(true){
                int readCount = fis.read(bytes);
                if (readCount == -1){
                    break;
                }
                System.out.println(new String(bytes,0,readCount));
            }

             */
            int readCount;
            while ((readCount = fis.read(bytes)) != -1){
                System.out.print(new String(bytes,0,readCount));
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
