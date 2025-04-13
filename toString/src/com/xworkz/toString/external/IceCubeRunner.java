package com.xworkz.toString.external;

import com.xworkz.toString.internal.IceCube;

public class IceCubeRunner {
    public static void main(String[] args) {
        IceCube iceCube1 = new IceCube("Cubic", 2.5, "Tap Water");
        System.out.println(iceCube1);

        int hash = iceCube1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(iceCube1));

        IceCube iceCube2 = new IceCube("Cubic", 2.5, "Tap Water");
        IceCube iceCube3 = new IceCube("Round", 3.0, "Mineral Water");

        System.out.println("Checking same location: " + (iceCube1 == iceCube2));
        boolean same = iceCube1.equals(iceCube2);
        System.out.println("IceCube1 is same as IceCube2: " + same);

        System.out.println("IceCube1 is same as IceCube3: " + iceCube1.equals(iceCube3));
    }
}
