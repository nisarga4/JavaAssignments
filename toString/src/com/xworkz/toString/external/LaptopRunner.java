package com.xworkz.toString.external;

import com.xworkz.toString.internal.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("HP", 16, "Intel i7");
        System.out.println(laptop1);

        int hash = laptop1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(laptop1));

        Laptop laptop2 = new Laptop("HP", 16, "Intel i7");
        Laptop laptop3 = new Laptop("Dell", 8, "AMD Ryzen 5");

        System.out.println("Checking same location: " + (laptop1 == laptop2));
        boolean same = laptop1.equals(laptop2);
        System.out.println("Laptop1 is same as Laptop2: " + same);

        System.out.println("Laptop1 is same as Laptop3: " + laptop1.equals(laptop3));
    }
}
