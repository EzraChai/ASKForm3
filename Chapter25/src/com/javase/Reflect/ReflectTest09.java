package com.javase.Reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest09 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        try {
            Class className = Class.forName("com.javase.Service.UserService");

            s.append(Modifier.toString(className.getModifiers())).append(" class ").append(className.getSimpleName()).append(" {");

            Method []methods = className.getDeclaredMethods();
            for (Method method : methods){
                //public boolean login(String username,String password);
                s.append("\n\t"+Modifier.toString(method.getModifiers())+" "+method.getReturnType().getSimpleName()+" "+method.getName()+" ( ");

                Class[]parameterTypes = method.getParameterTypes();
                for (Class parameter : parameterTypes){
                    s.append(parameter.getSimpleName()+",");
                }
                s.deleteCharAt(s.length()-1);

                s.append(" )");
            }

            s.append("\n}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }
}
