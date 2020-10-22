package com.javase.Reflect;

public class AboutPath {
    public static void main(String[] args) {
        String path = Thread.currentThread().getContextClassLoader().getResource("com/classinfo2.properties").getPath();
        System.out.println(path);

        String path2 = Thread.currentThread().getContextClassLoader().getResource("com/javase/Bean/db.properties").getPath();
        System.out.println(path2);
    }
}
