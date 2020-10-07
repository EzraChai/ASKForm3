package com.javase.collection;

public class ForEachTest01 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i : a){
            System.out.println(i);
        }
    }
}
