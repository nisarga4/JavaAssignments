package com.xworkz.toString.external;

import com.xworkz.toString.internal.Unicorn;

public class UnicornRunner {
    public static void main(String[] args) {
        Unicorn u1 = new Unicorn("Sparkle", "Rainbow", true);
        Unicorn u2 = new Unicorn("Twilight", "White", true);

        System.out.println(u1);
        System.out.println(u2);

        System.out.println("HashCode1: " + u1.hashCode());
        System.out.println("HashCode2: " + u2.hashCode());
        System.out.println(new Unicorn("Starlight", "Blue", false).hashCode());
    }
}
