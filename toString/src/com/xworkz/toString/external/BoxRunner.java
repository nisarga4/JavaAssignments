package com.xworkz.toString.external;

import com.xworkz.toString.internal.Box;

public class BoxRunner {
    public static void main(String[] args) {
        Box b1 = new Box("Plastic", 5.5, true);
        Box b2 = new Box("Cardboard", 3.0, false);

        System.out.println(b1);
        System.out.println(b2);

        System.out.println("HashCode1: " + b1.hashCode());
        System.out.println("HashCode2: " + b2.hashCode());
        System.out.println(new Box("Wooden", 7.2, true).hashCode());
    }
}
