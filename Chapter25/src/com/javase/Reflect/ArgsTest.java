package com.javase.Reflect;

public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10,29);
        //m("sds");

        m1(123,"Chloe");

        Arr("I ","loves ","Chloe");
        System.out.println("-------------");
        String[]Chloe = {"Chloe ","loves ","me"};
        Arr((Chloe));
    }

    public static void m(int... args) {
        System.out.println("M method is running");
    }
    public static void m1(int i, String ... args1){
        System.out.println("Chloe loves me.");
    }

    public static void Arr(String... args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
