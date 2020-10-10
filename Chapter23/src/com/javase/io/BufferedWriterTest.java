package com.javase.io;

import java.io.*;

public class BufferedWriterTest {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Copy"));
            bw.write("Hello World\n");
            bw.write("She loves Hello Kitty.");
            bw.flush();

            bw.close();

            BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Copy2")));
            bw2.write("Hey!\n");
            bw2.write("I love you.");
            bw2.flush();
            bw2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
