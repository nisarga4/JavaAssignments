package com.xworkz.toString.external;

import com.xworkz.toString.internal.IceCube;

public class IceCubeRunner {
    public static void main(String[] args) {
        IceCube i1 = new IceCube(2.5, true, "Square");
        IceCube i2 = new IceCube(1.5, false, "Round");

        System.out.println(i1);
        System.out.println(i2);

        System.out.println("HashCode1: " + i1.hashCode());
        System.out.println("HashCode2: " + i2.hashCode());
        System.out.println(new IceCube(3.0, true, "Rectangle").hashCode());
    }
}
