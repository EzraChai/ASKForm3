package com.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public static void log(String msg) {

        try {
            PrintStream ps = new PrintStream(new FileOutputStream("LogFile",true));
            System.setOut(ps);
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss SSS");
            String strTime = simpleDateFormat.format(date);
            System.out.println(strTime + " crash: " + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

