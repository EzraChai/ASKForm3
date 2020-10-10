package com.javase.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTest02 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("/home/juanzhe/Documents/IO/MasaTidur");
            fw = new FileWriter("/home/juanzhe/Documents/IO/MasaTidurCopy.txt");

            char[]chars = new char[1024 * 512];
            int readerCount = 0;
            while ((readerCount = fr.read(chars)) != -1){
                fw.write(chars,0,readerCount);
            }

            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
