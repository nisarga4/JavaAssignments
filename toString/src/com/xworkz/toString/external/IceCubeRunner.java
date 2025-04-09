package com.xworkz.toString.external;
import com.xworkz.toString.internal.IceCube;

    public class IceCubeRunner {
        public static void main(String[] args) {
            IceCube cube1 = new IceCube("Square", 2.5, true, "Filtered Water");
            IceCube cube2 = new IceCube("Sphere", 3.0, false, "Mineral Water");

            System.out.println(cube1);
            System.out.println(cube2);
        }
    }