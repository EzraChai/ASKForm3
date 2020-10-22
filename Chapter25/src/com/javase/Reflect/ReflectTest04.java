package com.javase.Reflect;

public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            Class.forName("com.javase.Reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

