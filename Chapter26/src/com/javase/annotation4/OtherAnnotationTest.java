package com.javase.annotation4;

public class OtherAnnotationTest {

    @OtherAnnotation(age = 15, email = {"juanzhe2@gmail.com","dabaochloe@gmail.com"},SeasonArr = {Season.SPRING,Season.SUMMER})
    public void doOther(){

    }

    @OtherAnnotation(age = 15, email = "dabaochloe@gmail.com",SeasonArr = Season.WINTER)
    public void doSome(){

    }
}
