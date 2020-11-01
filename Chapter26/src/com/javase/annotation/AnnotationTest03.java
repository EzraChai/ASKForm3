package com.javase.annotation;

public class AnnotationTest03 {
    public static void main(String[] args) {
        AnnotationTest03 at3 = new AnnotationTest03();
        at3.doOther();
    }

    @Deprecated
    public void doSome(){
        System.out.println("do something");
    }

    //Outdated
    @Deprecated
    public void doOther(){
        System.out.println("do Other");
    }
}

class T{
    @Deprecated
    private String s;

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        AnnotationTest03 at3 = new AnnotationTest03();
        at3.doSome();
        at3.doOther();

        Class c = Class.forName("java.util.Date");
        Object obj = c.newInstance();
    }
}