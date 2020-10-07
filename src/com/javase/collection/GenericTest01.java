package com.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        /*
        //Not efficient

        List myList = new ArrayList();
        Cat cat = new Cat();
        Bird bird = new Bird();
        myList.add(cat);
        myList.add(bird);

        Iterator it = myList.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            if (obj instanceof Cat){
                Cat catDown = (Cat)obj;
                catDown.catchMouse();
            }else if (obj instanceof Bird){
                Bird birdDown = (Bird)obj;
                birdDown.fly();
            }
        }

         */
        //an only store Animal Class
        List<Animal> myList = new ArrayList<Animal>();
        Cat cat = new Cat();
        Bird bird = new Bird();

        //123 not in the Animal Class
        // myList.add("123");

        myList.add(cat);
        myList.add(bird);

        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()){
            Animal a = it.next();
            if (a instanceof Cat){
                Cat c = (Cat)a;
                c.catchMouse();
            }else if(a instanceof Bird){
                Bird b = (Bird)a;
                b.fly();
            }
        }
    }
}
class Animal{
    public void move(){
        System.out.println("Animal move");
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("Cat is catching a mouse");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("Bird is flying");
    }
}
