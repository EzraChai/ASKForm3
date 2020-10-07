package com.javase.collection;

public class GenericTest02 <Chloe>{
    public void Love(Chloe chloe){
        System.out.println("I'm in love with Chloe");
    }

    public static void main(String[] args) {
        GenericTest02<String> gt = new GenericTest02<>();
        gt.Love("CG");
    }
}
