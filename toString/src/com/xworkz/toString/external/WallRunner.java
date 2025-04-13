package com.xworkz.toString.external;

import com.xworkz.toString.internal.Wall;

public class WallRunner {
    public static void main(String[] args) {
        Wall wall1 = new Wall("Brick", 3.0, 5.0);
        System.out.println(wall1);

        int hash = wall1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(wall1));

        Wall wall2 = new Wall("Brick", 3.0, 5.0);
        Wall wall3 = new Wall("Concrete", 4.0, 5.0);

        System.out.println("Checking same location: " + (wall1 == wall2));
        boolean same = wall1.equals(wall2);
        System.out.println("Wall1 is same as Wall2: " + same);

        System.out.println("Wall1 is same as Wall3: " + wall1.equals(wall3));
    }
}
