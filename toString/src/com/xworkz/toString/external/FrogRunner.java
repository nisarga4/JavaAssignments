package com.xworkz.toString.external;

import com.xworkz.toString.internal.Frog;

public class FrogRunner {
    public static void main(String[] args) {
        Frog f1 = new Frog("Tree Frog", "Rainforest", true);
        Frog f2 = new Frog("Bullfrog", "Pond", false);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println("HashCode1: " + f1.hashCode());
        System.out.println("HashCode2: " + f2.hashCode());
        System.out.println(new Frog("Glass Frog", "Jungle", true).hashCode());
    }
}
