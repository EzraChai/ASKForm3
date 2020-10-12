package com.javase.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileHomework {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        File f1 = new File("D:\\IO");

        try {
            fis = new FileInputStream(f1);
            File[]files = f1.listFiles();
            fos = new FileOutputStream(f1);
            for (File f : files) {
                //fos.write();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
