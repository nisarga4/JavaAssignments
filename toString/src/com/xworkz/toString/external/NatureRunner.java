package com.xworkz.toString.external;

import com.xworkz.toString.internal.Nature;

public class NatureRunner {
    public static void main(String[] args) {
        Nature n1 = new Nature("Forest", true, "Western Ghats");
        Nature n2 = new Nature("River", false, "Ganga");

        System.out.println(n1);
        System.out.println(n2);

        System.out.println("HashCode1: " + n1.hashCode());
        System.out.println("HashCode2: " + n2.hashCode());
        System.out.println(new Nature("Mountain", true, "Himalayas").hashCode());
    }
}
