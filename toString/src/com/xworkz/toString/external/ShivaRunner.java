
package com.xworkz.toString.external;

import com.xworkz.toString.internal.Shiva;

public class ShivaRunner {
    public static void main(String[] args) {
        Shiva s1 = new Shiva("Rudra", "Trishul", "Nandi");
        Shiva s2 = new Shiva("Mahadev", "Damaru", "Nandi");

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("HashCode1: " + s1.hashCode());
        System.out.println("HashCode2: " + s2.hashCode());
        System.out.println(new Shiva("Bhairava", "Sword", "Dog").hashCode());
    }
}
