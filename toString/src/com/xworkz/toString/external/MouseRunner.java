package com.xworkz.toString.external;

import com.xworkz.toString.internal.Mouse;

public class MouseRunner {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("Logitech", "Wireless", 35.50);
        System.out.println(mouse1);

        int hash = mouse1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(mouse1));

        Mouse mouse2 = new Mouse("Logitech", "Wireless", 35.50);
        Mouse mouse3 = new Mouse("HP", "Wired", 25.00);

        System.out.println("Checking same location: " + (mouse1 == mouse2));
        boolean same = mouse1.equals(mouse2);
        System.out.println("Mouse1 is same as Mouse2: " + same);

        System.out.println("Mouse1 is same as Mouse3: " + mouse1.equals(mouse3));
    }
}
