package com.xworkz.toString.external;

import com.xworkz.toString.internal.Box;

public class BoxRunner {
    public static void main(String[] args) {
        Box box1 = new Box("Red", 10.5, 20.0);
        System.out.println(box1);

        int hash = box1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(box1));

        Box box2 = new Box("Red", 10.5, 20.0);
        Box box3 = new Box("Blue", 12.0, 15.0);

        System.out.println("Checking same location: " + (box2 == box3));
        boolean same = box2.equals(box3);
        System.out.println("Box2 is same as Box3: " + same);
    }
}
