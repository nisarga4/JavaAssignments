package com.xworkz.toString.external;

import com.xworkz.toString.internal.John;

public class JohnRunner {
    public static void main(String[] args) {
        John j1 = new John(28, "Engineer", "Bangalore");
        John j2 = new John(35, "Doctor", "Mumbai");

        System.out.println(j1);
        System.out.println(j2);

        System.out.println("HashCode1: " + j1.hashCode());
        System.out.println("HashCode2: " + j2.hashCode());
        System.out.println(new John(40, "Teacher", "Delhi").hashCode());
    }
}
