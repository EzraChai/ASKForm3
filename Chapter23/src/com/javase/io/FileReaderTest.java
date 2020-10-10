package com.javase.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("/home/juanzhe/Documents/IO/MasaTidur");
            /*
            char[]chars = new char[4];
            fr.read(chars);
            for (char c : chars){
                System.out.print(c);
            }

             */
            char[]chars = new char[4];
            int readerCount = 0;
            while ((readerCount = fr.read(chars))!= -1){
                System.out.print(new String(chars,0,readerCount));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
