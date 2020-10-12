package com.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) {
        PrintStream ps = System.out;
        ps.println("Hello World!");

        try {
            PrintStream printStream = new PrintStream(new FileOutputStream("Log"));
            System.setOut(printStream);

            System.out.println("Hello World!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
