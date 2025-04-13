package com.xworkz.toString.external;

import com.xworkz.toString.internal.Rasgulla;

public class RasgullaRunner {
    public static void main(String[] args) {
        Rasgulla rasgulla1 = new Rasgulla("Bengali Rasgulla", 150, "Medium");
        System.out.println(rasgulla1);

        int hash = rasgulla1.hashCode();
        System.out.println("Hash Code: " + hash);

        Rasgulla rasgulla2 = new Rasgulla("Bengali Rasgulla", 150, "Medium");
        Rasgulla rasgulla3 = new Rasgulla("Anguri Rasgulla", 200, "Sweet");

        System.out.println("Checking same location: " + (rasgulla1 == rasgulla2));
        boolean same = rasgulla1.equals(rasgulla2);
        System.out.println("Rasgulla1 is same as Rasgulla2: " + same);

        boolean different = rasgulla1.equals(rasgulla3);
        System.out.println("Rasgulla1 is same as Rasgulla3: " + different);
    }
}
