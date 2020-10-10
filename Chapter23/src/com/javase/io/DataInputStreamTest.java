package com.javase.io;

import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamTest {
    public static void main(String[] args) {
        try {
            DataInputStream dos = new DataInputStream(new FileInputStream("Data"));
            byte b = dos.readByte();
            short s = dos.readShort();
            int i = dos.readInt();
            long l = dos.readLong();
            float f = dos.readFloat();
            double d = dos.readDouble();
            boolean sex = dos.readBoolean();
            char c = dos.readChar();

            System.out.println(b);
            System.out.println(s);
            System.out.println(i);
            System.out.println(l);
            System.out.println(f);
            System.out.println(d);
            System.out.println(sex);
            System.out.println(c);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
