package com.xworkz.toString.external;

import com.xworkz.toString.internal.Fire;

public class FireRunner {
    public static void main(String[] args) {
        Fire f1 = new Fire("Bonfire", 500, true);
        Fire f2 = new Fire("Wildfire", 900, false);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println("HashCode1: " + f1.hashCode());
        System.out.println("HashCode2: " + f2.hashCode());
        System.out.println(new Fire("Gas Fire", 650, true).hashCode());
    }
}
