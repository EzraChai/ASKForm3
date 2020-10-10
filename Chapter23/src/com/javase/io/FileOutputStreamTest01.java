package com.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("myFile",true);
            byte[]bytes = {98,99,100,101,32,98,32};
            fos.write(bytes);
            fos.write(bytes,0,2);

            String s = "I love Chloe Gan";
            byte[]bs = s.getBytes();
            fos.write(bs);

            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
