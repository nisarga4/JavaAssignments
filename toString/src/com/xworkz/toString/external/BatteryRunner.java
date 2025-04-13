package com.xworkz.toString.external;

import com.xworkz.toString.internal.Battery;

public class BatteryRunner {
    public static void main(String[] args) {
        Battery battery1 = new Battery("Duracell", 3000, "AA");
        System.out.println(battery1);

        int hash = battery1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(battery1));

        Battery battery2 = new Battery("Duracell", 3000, "AA");
        Battery battery3 = new Battery("Energizer", 2500, "AAA");

        System.out.println("Checking same location: " + (battery2 == battery3));
        boolean same = battery2.equals(battery3);
        System.out.println("Battery2 is same as Battery3: " + same);
    }
}
