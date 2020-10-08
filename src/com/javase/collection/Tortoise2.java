package com.javase.collection;

class Tortoise2 implements Comparable<Tortoise2>{
    int age;

    public Tortoise2(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tortoise2[" +
                "age ==> " + age +
                ']';
    }

    @Override
    public int compareTo(Tortoise2 o) {
        return this.age - o.age;
    }
}
