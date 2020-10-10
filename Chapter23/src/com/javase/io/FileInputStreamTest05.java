package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/home/juanzhe/Documents/IO/Main");

            //int readByte2 = fis.read();
            //System.out.println("Bytes available : "+fis.available());

            //What's the usage of this?
            byte[]bytes = new byte[fis.available()];
            int readBytes = fis.read(bytes);
            System.out.print(new String(bytes));

            //fis.skip(3);
            //System.out.println(fis.read());

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
