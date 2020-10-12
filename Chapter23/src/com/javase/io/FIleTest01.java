package com.javase.io;

import java.io.File;
import java.io.IOException;

public class FIleTest01 {
    public static void main(String[] args) {
        File f1 = new File("D:\\IO\\file");

        if(!f1.exists()){
            //Create File
            // f1.createNewFile();
            f1.mkdir();
        }

        File f2 = new File("D:\\IO\\a\\b\\c\\d\\e\\f");
        if (!f2.exists()){
            f2.mkdirs();
        }

        File f3 = new File("D:\\Idea\\IntelliJ IDEA Community Edition 2020.2.3\\jbr\\bin\\modular-sdk\\modules\\jcef\\com\\jetbrains\\cef");
        String parentPath = f3.getParent();
        System.out.println(parentPath);
        File parentFile = f3.getParentFile();
        System.out.println(parentFile.getAbsolutePath());

        File f4 = new File("File");
        System.out.println(f4.getAbsolutePath());
    }
}
