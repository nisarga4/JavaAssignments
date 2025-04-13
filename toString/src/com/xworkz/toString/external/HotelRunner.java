package com.xworkz.toString.external;

import com.xworkz.toString.internal.Hotel;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Marriott", "New York", 5);
        System.out.println(hotel1);

        int hash = hotel1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(hotel1));

        Hotel hotel2 = new Hotel("Marriott", "New York", 5);
        Hotel hotel3 = new Hotel("Hilton", "Los Angeles", 4);

        System.out.println("Checking same location: " + (hotel1 == hotel2));
        boolean same = hotel1.equals(hotel2);
        System.out.println("Hotel1 is same as Hotel2: " + same);

        System.out.println("Hotel1 is same as Hotel3: " + hotel1.equals(hotel3));
    }
}
