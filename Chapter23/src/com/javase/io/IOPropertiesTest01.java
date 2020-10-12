package com.javase.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class IOPropertiesTest01 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("userinfo");
            Properties properties = new Properties();

            properties.load(fileReader);

            String username = properties.getProperty("username");
            System.out.println(username);
            String password = properties.getProperty("password");
            System.out.println(password);

            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
