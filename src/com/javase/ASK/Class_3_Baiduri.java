package com.javase.ASK;

import java.util.TreeSet;

public class Class_3_Baiduri {
    public static void main(String[] args) {
        TreeSet<Pupil> class3BaiduriNameList = new TreeSet<>();
        class3BaiduriNameList.add(new Pupil("Chloe Gan"));
        class3BaiduriNameList.add(new Pupil("Chai Juan Zhe"));
        class3BaiduriNameList.add(new Pupil("Joy Joy Salvestian"));
        class3BaiduriNameList.add(new Pupil("Yeng Ming Ching"));
        class3BaiduriNameList.add(new Pupil("Yuventhiran a/l Ramesh"));
        class3BaiduriNameList.add(new Pupil("Nazirah binti Hamadi"));
        class3BaiduriNameList.add(new Pupil("Tan Ker Rou Zoewin"));
        class3BaiduriNameList.add(new Pupil("Tan Pei Yuin"));
        class3BaiduriNameList.add(new Pupil("Toh Xin Tian"));
        class3BaiduriNameList.add(new Pupil("Vikassni a/p Puvaneswaran"));
        class3BaiduriNameList.add(new Pupil("Vrindda a/p Balasingam"));
        class3BaiduriNameList.add(new Pupil("Arshim Long bin Adam Long"));
        class3BaiduriNameList.add(new Pupil("Michelle Yap"));
        class3BaiduriNameList.add(new Pupil("Morvirn a/l Deva"));
        class3BaiduriNameList.add(new Pupil("Kishen a/l Dinesh"));
        class3BaiduriNameList.add(new Pupil("Aivee binti Adi Sufian Chan"));
        class3BaiduriNameList.add(new Pupil("Sri Lashmy a/p Krishnan"));
        class3BaiduriNameList.add(new Pupil("Tiew Hui Ling"));
        class3BaiduriNameList.add(new Pupil("Wong En Xue"));
        class3BaiduriNameList.add(new Pupil("Dinie Safiah Binti Shahren Anuwar"));
        class3BaiduriNameList.add(new Pupil("Yarvine Kumar a/l Singaravadivelan"));
        class3BaiduriNameList.add(new Pupil("Radhinal Amirin bin Mohd Fazli"));
        class3BaiduriNameList.add(new Pupil("Thurgaashiny a/p Kumara Selvan"));
        class3BaiduriNameList.add(new Pupil("Aina Sofea Binti Ahmad Hashim"));
        class3BaiduriNameList.add(new Pupil("Choo Chi Yan"));
        class3BaiduriNameList.add(new Pupil("Irdina binti Arif"));
        class3BaiduriNameList.add(new Pupil("Hirshvan Raj a/l Rajendran"));
        class3BaiduriNameList.add(new Pupil("Litikka a/p Chandran"));
        class3BaiduriNameList.add(new Pupil("Parvish a/l Sarugunan"));
        class3BaiduriNameList.add(new Pupil("Chiok Yu Qing"));
        class3BaiduriNameList.add(new Pupil("Kuroshinirai a/p Ganesan"));
        class3BaiduriNameList.add(new Pupil("Mohamad Aiman bin Sultan"));
        class3BaiduriNameList.add(new Pupil("Priyasree a/p Karunanethi"));
        class3BaiduriNameList.add(new Pupil("Shelasheni a/p Vijayandran"));
        class3BaiduriNameList.add(new Pupil("Vanessa St Steven"));

        int size  = class3BaiduriNameList.size();
        System.out.println("My class got " + size + " students.");
        System.out.println();
        System.out.println("---------------3 Baiduri 2020 Namelist---------------");
        System.out.println();

        int i = 1;
        for (Pupil pupil : class3BaiduriNameList){
            System.out.println("Bil. " + i + "  "+pupil);
            i++;
        }
    }
}

class Pupil implements Comparable<Pupil>{
    String name ;

    public Pupil(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name = "+ name;
    }

    @Override
    public int compareTo(Pupil o) {
        return this.name.compareTo(o.name);
    }
}
