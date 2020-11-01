package com.javase.Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest10 {
    public static void main(String[] args) {
        try {
            Class userService = Class.forName("com.javase.Service.UserService");
            Object obj = userService.newInstance();

            Method loginMethod = userService.getDeclaredMethod("login",String.class,String.class);

            Object returnValue = loginMethod.invoke(obj,"admin","admin");

            System.out.println(returnValue);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
