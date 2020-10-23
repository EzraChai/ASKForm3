package com.javase.Reflect;

import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        //ResourceBundle bundle = ResourceBundle.getBundle("com.classinfo2");
        ResourceBundle bundle = ResourceBundle.getBundle("com/javase/Bean/db");

        String className = bundle.getString("className");
        System.out.println(className);
    }
}
