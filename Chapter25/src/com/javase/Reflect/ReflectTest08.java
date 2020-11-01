package com.javase.Reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest08 {
    public static void main(String[] args) {
        try {
            Class Userservice = Class.forName("com.javase.Service.UserService");
            Method[]methods = Userservice.getDeclaredMethods();
            System.out.println(methods.length);

            for (Method method : methods){
                System.out.print(Modifier.toString(method.getModifiers()));

                System.out.print(" "+method.getReturnType().getSimpleName());

                System.out.println(" "+method.getName());

                Class[]parameter = method.getParameterTypes();
                for (Class para : parameter){
                    System.out.println(para.getSimpleName());
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
