package com.xworkz.toString.external;

import com.xworkz.toString.internal.Poision;

public class PoisionRunner {
    public static void main(String[] args) {
        Poision poison1 = new Poision("Cyanide", 50.0, "Synthetic");
        System.out.println(poison1);

        int hash = poison1.hashCode();
        System.out.println("Hash Code: " + hash);

        Poision poison2 = new Poision("Cyanide", 50.0, "Synthetic");
        Poision poison3 = new Poision("Arsenic", 60.0, "Natural");

        System.out.println("Checking same location: " + (poison1 == poison2));
        boolean same = poison1.equals(poison2);
        System.out.println("Poison1 is same as Poison2: " + same);

        boolean different = poison1.equals(poison3);
        System.out.println("Poison1 is same as Poison3: " + different);
    }
}
