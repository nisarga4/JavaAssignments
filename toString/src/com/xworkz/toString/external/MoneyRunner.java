package com.xworkz.toString.external;

import com.xworkz.toString.internal.Money;

public class MoneyRunner {
    public static void main(String[] args) {
        Money money1 = new Money(100, "USD", "Bills");
        System.out.println(money1);

        int hash = money1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(money1));

        Money money2 = new Money(100, "USD", "Bills");
        Money money3 = new Money(50, "INR", "Coins");

        System.out.println("Checking same location: " + (money1 == money2));
        boolean same = money1.equals(money2);
        System.out.println("Money1 is same as Money2: " + same);

        System.out.println("Money1 is same as Money3: " + money1.equals(money3));
    }
}
