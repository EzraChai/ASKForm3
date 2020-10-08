package com.javase.Review;

import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("Username","Chloe");
        pro.setProperty("Password","5201314");

        String username = pro.getProperty("Username");
        String password = pro.getProperty("Password");
        System.out.println(username + " " + password);
    }
}
