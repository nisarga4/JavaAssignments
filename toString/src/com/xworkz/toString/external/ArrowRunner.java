package com.xworkz.toString.external;

import com.xworkz.toString.internal.Arrow;

public class ArrowRunner {
    public static void main(String[] args) {
        Arrow arrow1 = new Arrow("Wood", 30, "Hunting");
        System.out.println(arrow1);

        int hash = arrow1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(arrow1));

        Arrow arrow2 = new Arrow("Wood", 30, "Hunting");
        Arrow arrow3 = new Arrow("Steel", 25, "Sport");

        System.out.println("Checking same location: " + (arrow2 == arrow3));
        boolean same = arrow2.equals(arrow3);
        System.out.println("Arrow2 is same as Arrow3: " + same);
    }
}
