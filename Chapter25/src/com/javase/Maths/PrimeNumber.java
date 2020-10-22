package com.javase.Maths;

public class PrimeNumber{
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i){
                    System.out.println(i);
                }else if ( i % j == 0){
                    break;
                }
            }
        }
    }
}
