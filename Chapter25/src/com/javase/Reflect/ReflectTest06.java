package com.javase.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest06 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        try {
            Class studentClass = Class.forName("com.javase.Bean.Student");

            s.append( Modifier.toString(studentClass.getModifiers()) +" class "+studentClass.getSimpleName()+" { \n");

            Field[]f = studentClass.getDeclaredFields();
            for (Field field : f){
                s.append("\t"+Modifier.toString(field.getModifiers())+" "+ field.getType().getSimpleName()+" "+field.getName()+"; \n");
            }

            s.append("}");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }
}
