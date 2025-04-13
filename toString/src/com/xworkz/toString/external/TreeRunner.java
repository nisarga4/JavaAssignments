package com.xworkz.toString.external;

import com.xworkz.toString.internal.Unicorn;

public class UnicornRunner {
    public static void main(String[] args) {
        Unicorn unicorn1 = new Unicorn("Twilight", "Purple", 5);
        System.out.println(unicorn1);

        int hash = unicorn1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(unicorn1));

        Unicorn unicorn2 = new Unicorn("Twilight", "Purple", 5);
        Unicorn unicorn3 = new Unicorn("Starlight", "Blue", 4);

        System.out.println("Checking same location: " + (unicorn1 == unicorn2));
        boolean same = unicorn1.equals(unicorn2);
        System.out.println("Unicorn1 is same as Unicorn2: " + same);

        System.out.println("Unicorn1 is same as Unicorn3: " + unicorn1.equals(unicorn3));
    }
}
