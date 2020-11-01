package com.javase.annotation6;

import java.lang.reflect.Method;

public class MyAnnotationTest {

    @MyAnnotation(username = "Chloe" ,password = "Chloe123")
    public void doSome(){

    }

    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.javase.annotation6.MyAnnotationTest");

            Method doSomeMethod = c.getDeclaredMethod("doSome");

            if (doSomeMethod.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation myAnnotation = doSomeMethod.getAnnotation(MyAnnotation.class);
                System.out.println("Username = "+myAnnotation.username());
                System.out.println("Password = "+myAnnotation.password());

            }

        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
