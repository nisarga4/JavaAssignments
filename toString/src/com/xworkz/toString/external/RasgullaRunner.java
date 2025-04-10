package com.xworkz.toString.external;

import com.xworkz.toString.internal.Rasgulla;

public class RasgullaRunner {
    public static void main(String[] args) {
        Rasgulla r1 = new Rasgulla("High", true, 5);
        Rasgulla r2 = new Rasgulla("Medium", false, 10);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("HashCode1: " + r1.hashCode());
        System.out.println("HashCode2: " + r2.hashCode());
        System.out.println(new Rasgulla("Low", true, 7).hashCode());
    }
}
