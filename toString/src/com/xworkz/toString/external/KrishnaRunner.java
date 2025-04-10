package com.xworkz.toString.external;

import com.xworkz.toString.internal.Krishna;

public class KrishnaRunner {
    public static void main(String[] args) {
        Krishna k1 = new Krishna("Vishnu", "Sudharshana Chakra", "Mathura");
        Krishna k2 = new Krishna("Cowherd", "Flute", "Vrindavan");

        System.out.println(k1);
        System.out.println(k2);

        System.out.println("HashCode1: " + k1.hashCode());
        System.out.println("HashCode2: " + k2.hashCode());
        System.out.println(new Krishna("Divine", "Peacock Feather", "Kurukshetra").hashCode());
    }
}
