package com.javase.annotation;

@MyAnnotation
public class AnnotationTest01 {

    @MyAnnotation
    private int no;

    @MyAnnotation
    public AnnotationTest01() {
    }

    @MyAnnotation
    public static void m1(){
        int  i = 100;
    }

    @MyAnnotation
    public void m2(@MyAnnotation String name,@MyAnnotation String password){

    }
}

@MyAnnotation
interface MyInterface{

}

@MyAnnotation
enum Season{
    Spring,Summer,Autumn,Winter
}
