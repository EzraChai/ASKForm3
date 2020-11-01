package com.javase.annotation2;

public @interface MyAnnotation {

    /**
     * Name value
     * @return
     */
    String name();

    String color();

    int age() default 18;//Default
}
