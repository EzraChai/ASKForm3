package com.javase.annotation5;

//Important
public class ReflectAnnotationTest {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.javase.annotation5.MyAnnotationTest");

            //Check whether the class have @MyAnnotation
            System.out.println(c.isAnnotationPresent(MyAnnotation.class));

            if (c.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation MyAnnotation = (MyAnnotation) c.getAnnotation(MyAnnotation.class);
                System.out.println("类上面的注解对象： "+MyAnnotation);

                String MyAnnotationValue = MyAnnotation.value();
                System.out.println(MyAnnotationValue);
            }


            //Check whether the String class have @MyAnnotation
            Class StringClass = Class.forName("java.lang.String");
            System.out.println(StringClass.isAnnotationPresent(MyAnnotation.class));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
