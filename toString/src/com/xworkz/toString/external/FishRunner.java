package com.xworkz.toString.external;

import com.xworkz.toString.internal.Fish;

public class FishRunner {
    public static void main(String[] args) {
        Fish f1 = new Fish("Salmon", 2.5, true);
        Fish f2 = new Fish("Tuna", 3.0, false);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println("HashCode1: " + f1.hashCode());
        System.out.println("HashCode2: " + f2.hashCode());
        System.out.println(new Fish("Catfish", 1.8, true).hashCode());
    }
}
