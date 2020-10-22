package com.javase.Reflect;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class IOPropertiesTest {
    public static void main(String[] args) throws IOException {
        //String path = Thread.currentThread().getContextClassLoader().getResource("com/classinfo2.properties").getPath();

        //FileReader reader = new FileReader(path);

        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("com/classinfo2.properties");

        Properties pro = new Properties();
        pro.load(reader);
        String className = pro.getProperty("className");
        System.out.println(className);

        assert reader != null;
        reader.close();

    }
}
