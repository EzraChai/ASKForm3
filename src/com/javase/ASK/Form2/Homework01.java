package com.javase.ASK.Form2;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan nombor-nombor integer yang perlu dijumlahkan.");
        System.out.println("Masukkan nombor 0 jika ingin berhenti memasukkan numbor.");
        int num = 0;
        int total = 0;
        int turn = 0;
        do {
            num = s.nextInt();
            total += num;
            turn ++;
        }while (0 != num);
        System.out.println("Jumlah nombor : "+total);
        float averageNum = (float) total / (turn-1);
        System.out.println("Purata bagi nombor-nombor yang dimasukkan : "+ averageNum);
    }
}
