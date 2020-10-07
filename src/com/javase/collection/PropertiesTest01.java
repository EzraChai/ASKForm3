package com.javase.collection;

import java.util.Properties;

public class PropertiesTest01 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("username","root");
        pro.setProperty("password","root");

        String username = pro.getProperty("username");
        String password = pro.getProperty("password");

        System.out.println(username +  "   " + password );


    }
}
