package com.javase.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("File");
            char[]chars = {'我','爱','C','h','l','o','e'};
            fw.write(chars);
            fw.write(chars,2,5);
            fw.write("I love Chloe Gan");

            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
