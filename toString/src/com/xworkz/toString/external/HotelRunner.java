package com.xworkz.toString.external;
import com.xworkz.toString.internal.Hotel;

    public class HotelRunner {
        public static void main(String[] args) {
            Hotel hotel1 = new Hotel("The Grand Palace", "Bangalore", 5, true);
            Hotel hotel2 = new Hotel("Sea Breeze Inn", "Goa", 3, false);

            System.out.println(hotel1);
            System.out.println(hotel2);
        }
    }
