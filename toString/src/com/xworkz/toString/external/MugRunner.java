package com.xworkz.toString.external;

import com.xworkz.toString.internal.Mug;

public class MugRunner {
    public static void main(String[] args) {
        Mug mug1 = new Mug("Red", "Ceramic", 0.3);
        System.out.println(mug1);

        int hash = mug1.hashCode();
        System.out.println("Hash Code: " + hash);

        Mug mug2 = new Mug("Red", "Ceramic", 0.3);
        Mug mug3 = new Mug("Blue", "Plastic", 0.4);

        System.out.println("Checking same location: " + (mug1 == mug2));
        boolean same = mug1.equals(mug2);
        System.out.println("Mug1 is same as Mug2: " + same);

        boolean different = mug1.equals(mug3);
        System.out.println("Mug1 is same as Mug3: " + different);
    }
}
