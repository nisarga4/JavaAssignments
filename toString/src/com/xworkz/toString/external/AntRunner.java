package com.xworkz.toString.external;
import com.xworkz.toString.internal.Ant;

public class AntRunner {
    public static void main(String[] args) {
        Ant ant1 = new Ant("Fire Ant", 4.5, "Red");
        System.out.println(ant1);

        int hash = ant1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(ant1));

        Ant ant2 = new Ant("Fire Ant", 4.5, "Red");
        Ant ant3 = new Ant("Carpenter Ant", 5.0, "Black");

        System.out.println("Checking same location: " + (ant2 == ant3));
        boolean same = ant2.equals(ant3);
        System.out.println("Ant2 is same as Ant3: " + same);
    }
}
