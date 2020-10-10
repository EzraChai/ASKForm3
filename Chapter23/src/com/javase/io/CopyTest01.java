package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("/home/juanzhe/Downloads/Linux_Ubuntu.png");

            fos = new FileOutputStream("/home/juanzhe/Documents/IO/Linux_Ubuntu.png");

            byte[]bytes = new byte[1023*1024];
            int readCount = 0;
            while ((readCount = fis.read(bytes))!= -1 ){
                fos.write(bytes,0,readCount);
            }

            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            if (fis != null) {
                try {
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
