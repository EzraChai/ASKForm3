package com.javase.Reflect;

import java.lang.reflect.Field;

public class ReflectTest07 {
    public static void main(String[] args) {
        try {
            Class studentClass = Class.forName("com.javase.Bean.Student");
            Object obj = studentClass.newInstance();//Student class created

            Field noField = studentClass.getDeclaredField("no");

            noField.set(obj,123);

            System.out.println(noField.getName()+" = "+noField.get(obj));

            Field name = studentClass.getDeclaredField("name");

            //打破封装
            name.setAccessible(true);

            name.set(obj,"Chloe");
            System.out.println(name.getName()+" = "+name.get(obj));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
