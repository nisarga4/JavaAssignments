package com.xworkz.toString.external;

import com.xworkz.toString.internal.Sunglass;

public class SunglassRunner {
    public static void main(String[] args) {
        Sunglass s1 = new Sunglass("RayBan", true, 4999.0);
        Sunglass s2 = new Sunglass("Fastrack", false, 1299.0);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("HashCode1: " + s1.hashCode());
        System.out.println("HashCode2: " + s2.hashCode());
        System.out.println(new Sunglass("Oakley", true, 5999.0).hashCode());
    }
}
