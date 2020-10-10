package com.javase.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/juanzhe/Documents/IO/MasaTidurCopy.txt");
        BufferedReader br = new BufferedReader(fr);

        String firstLine = br.readLine();
        System.out.println(firstLine);

        String secondLine = br.readLine();
        System.out.println(secondLine);

        String s = null;
        while (( s = br.readLine())!= null){
            System.out.println(s);
        }

        br.close();
    }
}
