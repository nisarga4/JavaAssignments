package com.xworkz.toString.external;

import com.xworkz.toString.internal.Hotel;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel h1 = new Hotel("Taj", 5, true);
        Hotel h2 = new Hotel("Ginger", 3, false);

        System.out.println(h1);
        System.out.println(h2);

        System.out.println("HashCode1: " + h1.hashCode());
        System.out.println("HashCode2: " + h2.hashCode());
        System.out.println(new Hotel("Marriott", 4, true).hashCode());
    }
}
