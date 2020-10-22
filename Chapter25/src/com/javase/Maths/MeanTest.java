package com.javase.Maths;

import java.util.Arrays;

public class MeanTest {
    public static void main(String[] args) {
        double sum = 0;
        double[]list ={4.2,8.9,5.7,6.3,8.1,5.7,3.7,9.4};
        for (double i : list){
            sum += i;
        }
        double ans = sum / (list.length);
        System.out.println("Mean == "+ans);

        Thread Test = new Thread(new MedianTest());
        Test.setName("Median");
        Test.start();
    }
}

class MedianTest implements Runnable{

    @Override
    public void run() {
        double[]list ={4.2,8.9,5.7,6.3,8.1,5.7,3.7,9.4};
        Arrays.sort(list);

        int median;
        median = list.length /2 ;
        System.out.println(Thread.currentThread().getName()+" == "+list[median]);

    }
}
