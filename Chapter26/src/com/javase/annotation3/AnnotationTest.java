package com.javase.annotation3;

public class AnnotationTest {

    @MyAnnotation(value = "fd")
    public void doSome(){

    }

    @MyAnnotation("3")
    public void doOther(){

    }
}
