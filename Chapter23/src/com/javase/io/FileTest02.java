package com.javase.io;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Program Files\\Huawei\\PCManager\\avcodec-58.dll");
        System.out.println("File Name : " + f1.getName());

        if (f1.isDirectory()){
            System.out.println("It is a directory");
        }else {
            System.out.println("It is a file");
        }

        long milliseconds = f1.lastModified();
        Date time = new Date(milliseconds);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String date = sdf.format(time);
        System.out.println(date);

        long kb = f1.length();

        double mb = (double)(kb / 1e+6);
        //while (kb > 1e+6){
          //  kb -= 1e+6;
            //mb += 1;
        //}
        //System.out.println(mb + " MB" + kb + "kb");
        System.out.println(mb + "MB");

    }
}
