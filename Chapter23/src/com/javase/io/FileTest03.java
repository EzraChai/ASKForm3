package com.javase.io;

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Program Files\\Huawei\\PCManager");
        // Get all the file
        File[]files = f1.listFiles();
        for (File f : files){
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getName());
        }
    }
}
