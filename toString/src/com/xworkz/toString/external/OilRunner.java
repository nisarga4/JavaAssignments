package com.xworkz.toString.external;

import com.xworkz.toString.internal.Oil;

public class OilRunner {
    public static void main(String[] args) {
        Oil oil1 = new Oil("Coconut", "Cold Pressed", 1.0);
        System.out.println(oil1);

        int hash = oil1.hashCode();
        System.out.println("Hash Code: " + hash);

        Oil oil2 = new Oil("Coconut", "Cold Pressed", 1.0);
        Oil oil3 = new Oil("Olive", "Extra Virgin", 0.5);

        System.out.println("Checking same location: " + (oil1 == oil2));
        boolean same = oil1.equals(oil2);
        System.out.println("Oil1 is same as Oil2: " + same);

        boolean different = oil1.equals(oil3);
        System.out.println("Oil1 is same as Oil3: " + different);
    }
}
