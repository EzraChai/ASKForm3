package com.javase.Reflect;

public class ReflectTest01 {
    public static void main(String[] args) {
        Class c1 = null;
        try {
            c1 = Class.forName("java.lang.String");
            Class c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.lang.Integer");
            Class c4 = Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String x = "abc";
        Class y = x.getClass();
        System.out.println(y);
        System.out.println(c1 == y);
    }
}
