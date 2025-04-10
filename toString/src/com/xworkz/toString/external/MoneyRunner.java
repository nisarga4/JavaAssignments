package com.xworkz.toString.external;

import com.xworkz.toString.internal.Money;

public class MoneyRunner {
    public static void main(String[] args) {
        Money m1 = new Money("INR", 1000, false);
        Money m2 = new Money("USD", 50, true);

        System.out.println(m1);
        System.out.println(m2);

        System.out.println("HashCode1: " + m1.hashCode());
        System.out.println("HashCode2: " + m2.hashCode());
        System.out.println(new Money("EUR", 200, true).hashCode());
    }
}
