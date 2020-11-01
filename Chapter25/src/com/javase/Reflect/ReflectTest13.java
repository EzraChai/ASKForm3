package com.javase.Reflect;

public class ReflectTest13 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");

        Class superClass = c.getSuperclass();
        System.out.println(superClass.getName());

        Class[] Interface = c.getInterfaces();
        for (Class inter : Interface){
            System.out.println(inter.getName());
        }
    }
}
