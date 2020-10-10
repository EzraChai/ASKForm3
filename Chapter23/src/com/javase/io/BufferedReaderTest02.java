package com.javase.io;

import java.io.*;

public class BufferedReaderTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //fis = new FileInputStream("/home/juanzhe/Documents/IO/MasaTidurCopy.txt");
            //InputStreamReader reader = new InputStreamReader(fis);
            //BufferedReader br = new BufferedReader(reader);

            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/juanzhe/Documents/IO/MasaTidurCopy.txt")));

            String s = null;
            while ((s = br.readLine())!= null){
                System.out.println(s);
            }

            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
