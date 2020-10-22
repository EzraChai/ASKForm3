package com.javase.Reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReflectTest03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        FileReader fr = new FileReader("Chapter25/classinfo.properties");
        Properties pro = new Properties();
        pro.load(fr);

        fr.close();

        String className = pro.getProperty("className");
        //System.out.println(className);

        Class c = Class.forName(className);
        Object obj = c.newInstance();
        System.out.println(obj);
    }
}
