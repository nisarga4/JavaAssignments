package com.xworkz.toString.external;

import com.xworkz.toString.internal.Wall;

public class WallRunner {
    public static void main(String[] args) {
        Wall w1 = new Wall("Cream", 10.5, false);
        Wall w2 = new Wall("Green", 12.0, true);

        System.out.println(w1);
        System.out.println(w2);

        System.out.println("HashCode1: " + w1.hashCode());
        System.out.println("HashCode2: " + w2.hashCode());
        System.out.println(new Wall("Red", 9.5, false).hashCode());
    }
}
