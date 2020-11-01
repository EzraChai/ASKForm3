package com.javase.annotation4;

public @interface MyAnnotation {

    //byte short int long float double boolean String Class Enum

    int value();
    String value2();
    int[] value3();
    String[] value4();
    Season value5();
    Season[] value6();

    Class parameterType();
    Class[] parameterTypes();


}
