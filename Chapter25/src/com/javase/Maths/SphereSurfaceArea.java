package com.javase.Maths;

import java.util.Scanner;

public class SphereSurfaceArea {
    static double pi = (double)22/7;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = s.nextInt();

        System.out.println(surfaceArea(radius));
    }

    private static double surfaceArea(int radius) {
        return 4*(pi)*(Math.pow(radius,2));
    }


}


