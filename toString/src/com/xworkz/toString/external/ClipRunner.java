package com.xworkz.toString.external;

import com.xworkz.toString.internal.Clip;

public class ClipRunner {
    public static void main(String[] args) {
        Clip c1 = new Clip("Plastic", "Blue", true);
        Clip c2 = new Clip("Metal", "Silver", false);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("HashCode1: " + c1.hashCode());
        System.out.println("HashCode2: " + c2.hashCode());
        System.out.println(new Clip("Wood", "Brown", true).hashCode());
    }
}
