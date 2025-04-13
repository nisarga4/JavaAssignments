package com.xworkz.toString.external;

import com.xworkz.toString.internal.Mango;

public class MangoRunner {
    public static void main(String[] args) {
        Mango mango1 = new Mango("Alphonso", 0.5, "Ratnagiri");
        System.out.println(mango1);

        int hash = mango1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(mango1));

        Mango mango2 = new Mango("Alphonso", 0.5, "Ratnagiri");
        Mango mango3 = new Mango("Badami", 0.6, "Karnataka");

        System.out.println("Checking same location: " + (mango1 == mango2));
        boolean same = mango1.equals(mango2);
        System.out.println("Mango1 is same as Mango2: " + same);

        System.out.println("Mango1 is same as Mango3: " + mango1.equals(mango3));
    }
}
