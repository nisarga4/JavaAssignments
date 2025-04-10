package com.xworkz.toString.external;

import com.xworkz.toString.internal.Home;

public class HomeRunner {
    public static void main(String[] args) {
        Home h1 = new Home("Bangalore", 3, true);
        Home h2 = new Home("Mysore", 2, false);

        System.out.println(h1);
        System.out.println(h2);

        System.out.println("HashCode1: " + h1.hashCode());
        System.out.println("HashCode2: " + h2.hashCode());
        System.out.println(new Home("Udupi", 4, true).hashCode());
    }
}
