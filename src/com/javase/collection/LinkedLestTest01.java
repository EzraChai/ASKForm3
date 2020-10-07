package com.javase.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedLestTest01 {
    public static void main(String[] args) {
        List list = new LinkedList();
        Scanner s = new Scanner(System.in);
        String input = null;
        /*
        do {
            System.out.print("Enter a value that you want to put in a list : ");
            input = s.nextLine();
            addFunction(list, input);
        }while ("" != input);
        
         */
        while ("" != input){
            System.out.print("Enter a value : ");
            input = s.nextLine();
            addFunction(list, input);
        }

        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
    public static void addFunction(List list, String input){
        list.add(input);
    }
}
